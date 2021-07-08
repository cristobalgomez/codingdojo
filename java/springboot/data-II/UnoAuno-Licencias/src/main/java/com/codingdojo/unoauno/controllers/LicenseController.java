package com.codingdojo.unoauno.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.unoauno.models.License;
import com.codingdojo.unoauno.models.Person;
import com.codingdojo.unoauno.services.LicenseService;
import com.codingdojo.unoauno.services.PersonService;

@Controller
public class LicenseController {
	
	private final LicenseService licServ;
	private final PersonService perServ;
	
	public LicenseController(LicenseService licServ, PersonService perServ) {
		this.licServ = licServ;
		this.perServ = perServ;
	}
	
	@RequestMapping("/licenses/new")
	public String license(@ModelAttribute("license") License license, Model model) {
		List<Person> p = perServ.allPeople();
		model.addAttribute("person", p);
		return "/licenses/new.jsp";
	}
	
	@RequestMapping(value="/licenses", method=RequestMethod.POST)
	public String index(@Valid @ModelAttribute("license") License license, BindingResult result) {
		if(result.hasErrors()) {
			return "/licenses/new.jsp";
		} else {
			licServ.createLicense(license);
			return "redirect:/";
		}
	}
	

}
