package com.codingdojo.lenguajes.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.lenguajes.models.Language;
import com.codingdojo.lenguajes.services.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService lanService;
	
	public LanguageController(LanguageService lanService) {
		this.lanService = lanService;
	}

	@RequestMapping("/languages")
	public String index(@ModelAttribute("language") Language lan, Model model) {
		List<Language> languages = lanService.allLanguages();
		model.addAttribute("languages", languages);
		return "/languages/index.jsp";
	}
	
	@RequestMapping(value="/languages", method=RequestMethod.POST)
	public String newLanguage(@Valid @ModelAttribute("language") Language lan, BindingResult result, Model model) {
        if(result.hasErrors()) {
    		List<Language> languages = lanService.allLanguages();
    		model.addAttribute("languages", languages);
        	return "/languages/index.jsp";
        } else {
        	lanService.createLanguage(lan);
            return "redirect:/languages";
        }
	}
	
	@RequestMapping("/languages/{id}")
	public String showLanguage(@PathVariable("id") Long id, Model model) {
		Language language = lanService.findLanguage(id);
		model.addAttribute("language", language);
		return "/languages/show.jsp";
	}

	@RequestMapping("/languages/{id}/edit")
	public String editLanguage(@PathVariable("id") Long id, Model model) {
		Language language = lanService.findLanguage(id);
		model.addAttribute("language", language);
		return "/languages/edit.jsp";
	}
	
	@RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
	public String updateLanguage(@Valid @ModelAttribute("language") Language lan, BindingResult result) {
		if(result.hasErrors()) {
			return "/languages/edit.jsp";
		} else {
			lanService.createLanguage(lan);
			return "redirect:/languages";
		}
	}
	
	@RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
	public String delete(@PathVariable("id") Long id) {
		lanService.deleteLanguage(id);
		return "redirect:/languages";
	}
}
