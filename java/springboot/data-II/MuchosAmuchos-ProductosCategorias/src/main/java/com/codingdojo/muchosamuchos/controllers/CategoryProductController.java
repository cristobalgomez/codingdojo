package com.codingdojo.muchosamuchos.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.muchosamuchos.models.CategoryProduct;
import com.codingdojo.muchosamuchos.services.CategoryProductService;

@Controller
public class CategoryProductController {
	private final CategoryProductService catProSer;
	
	public CategoryProductController(CategoryProductService catProSer) {
		this.catProSer = catProSer;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(@ModelAttribute("categoryProduct") CategoryProduct catPro) {
		catProSer.createCategoryProduct(catPro);
		return "redirect:/products";
	}
	
}
