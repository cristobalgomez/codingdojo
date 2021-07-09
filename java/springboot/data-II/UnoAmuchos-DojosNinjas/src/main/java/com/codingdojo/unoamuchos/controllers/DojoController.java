package com.codingdojo.unoamuchos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.unoamuchos.models.Dojo;
import com.codingdojo.unoamuchos.services.DojoService;

@Controller
public class DojoController {

	private final DojoService dojoServ;
	
	public DojoController(DojoService dojoServ) {
		this.dojoServ = dojoServ;
	}
	
	@RequestMapping("/dojos")
	public String index(Model model) {
		List<Dojo> dojos = dojoServ.allDojos();
		model.addAttribute("dojos", dojos);
		return "/dojos/index.jsp";
	}
	
	@RequestMapping("/dojos/new")
	public String dojo(@ModelAttribute("dojo") Dojo dojo) {
		return "/dojos/new.jsp";
	}
	
	@RequestMapping(value="/dojos", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("dojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "/dojos/new.jsp";
		} else {
			dojoServ.createDojo(dojo);
			return "redirect:/dojos";
		}
	}
	
	@RequestMapping("/dojos/{id}")
	public String ninjas(@PathVariable("id") Long id, Model model) {
		Dojo dojo = dojoServ.findDojo(id);
		model.addAttribute("dojo", dojo);
		return "/dojos/dojo.jsp";
	}
}
