package com.codingdojo.unoamuchos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.unoamuchos.models.Dojo;
import com.codingdojo.unoamuchos.models.Ninja;
import com.codingdojo.unoamuchos.services.DojoService;
import com.codingdojo.unoamuchos.services.NinjaService;

@Controller
public class NinjaController {
	private final NinjaService ninjaServ;
	private final DojoService dojoServ;
	
	public NinjaController(NinjaService ninjaServ, DojoService dojoServ) {
		this.ninjaServ = ninjaServ;
		this.dojoServ = dojoServ;
	}
	
	@RequestMapping("/ninjas")
	public String index(Model model) {
		List<Ninja> ninjas = ninjaServ.allNinjas();
		model.addAttribute("ninjas", ninjas);
		return "/ninjas/index.jsp";
	}
	
	@RequestMapping("/ninjas/new")
	public String create(@ModelAttribute("ninja") Ninja ninja, Model model) {
		List<Dojo> dojos = dojoServ.allDojos();
		model.addAttribute("dojos", dojos);
		return "/ninjas/new.jsp";
	}
	
	@RequestMapping(value="/ninjas/new", method=RequestMethod.POST)
	public String postNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<Dojo> dojos = dojoServ.allDojos();
			model.addAttribute("dojos", dojos);
			return "/ninjas/new.jsp";
		} else {
			ninjaServ.createNinja(ninja);
			return "redirect:/";
			
		}
	}

}
