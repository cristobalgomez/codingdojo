package com.codingdojo.countries.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.countries.services.ApiService;

@Controller
public class CountriesController {
	private final ApiService service;
	
	public CountriesController(ApiService service) {
		this.service = service;
	}
	
	@RequestMapping("/")
	public String index(Model model) {
		model.addAttribute("sloveneSpeakingCountries", service.sloveneSpeakingCountries());
		model.addAttribute("numberOfCitiesByCountry", service.numberOfCities());
		model.addAttribute("mexicanCities", service.mexicanCitiesOver500k());
		model.addAttribute("countriesByPoplationAndSurface", service.countriesByPopOver100AndSurfaceUnder501());
		model.addAttribute("monarchyCountries", service.monarchyCountries());
		model.addAttribute("citiesInBuenosAires", service.argentinianCitiesInBuenosAires());
		model.addAttribute("languages", service.languagesByPercentageOver89());
		model.addAttribute("countriesByRegion", service.countriesByRegion());
		return "/views/index.jsp";
	}
}
