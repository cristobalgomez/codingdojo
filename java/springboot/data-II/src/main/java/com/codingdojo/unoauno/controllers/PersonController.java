package com.codingdojo.unoauno.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.codingdojo.unoauno.models.Person;
import com.codingdojo.unoauno.services.PersonService;

@Controller
public class PersonController {
	
	private final PersonService perSer;
	
	public PersonController(PersonService perSer) {
		this.perSer = perSer;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		List<Person> p = perSer.allPeople();
		model.addAttribute("people", p);
		return "/persons/index.jsp";
	}
	
	
	@RequestMapping("/persons/new")
	public String create(@ModelAttribute("person") Person person) {
		return "/persons/new.jsp";
	}
	
	@RequestMapping(value="/persons", method=RequestMethod.POST)
	public String postPerson(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if(result.hasErrors()) {
			return "/persons/new.jsp";
		} else {
			perSer.createPerson(person);
			return "redirect:/";
		}
	}
	
	@RequestMapping("/persons/{id}")
	public String person(@PathVariable("id") Long id, Model model) {
		Person p = perSer.findPerson(id);
		model.addAttribute("person", p);
		return "/persons/profile.jsp";
	}
	
}
