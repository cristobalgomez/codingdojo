package com.codingdojo.muchosamuchos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.muchosamuchos.models.Category;
import com.codingdojo.muchosamuchos.models.CategoryProduct;
import com.codingdojo.muchosamuchos.models.Product;
import com.codingdojo.muchosamuchos.services.CategoryService;
import com.codingdojo.muchosamuchos.services.ProductService;

@Controller
public class CategoryController {
	
	private final ProductService proSer;
	private final CategoryService catSer;
	
	public CategoryController(ProductService proSer, CategoryService catSer) {
		this.proSer = proSer;
		this.catSer = catSer;
	}
	
	@RequestMapping("/categories")
	public String create(Model model) {
		List<Category> categories = catSer.allCategories();
		model.addAttribute("categories", categories);
		return "/categories/index.jsp";
		
	}
	
	@RequestMapping("/categories/new")
	public String create(@ModelAttribute("category") Category Category) {
		return "/categories/new.jsp";
	}
	
	@RequestMapping(value="/categories/new", method=RequestMethod.POST)
	public String postCategory(@Valid @ModelAttribute("category") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "/categories/new.jsp";
		} else {
			catSer.createCategory(category);
			return "redirect:/categories";
		}
	}
	
	@RequestMapping("/categories/{id}")
	public String product(@ModelAttribute("categoryProduct") CategoryProduct catPro, @PathVariable("id") Long id, Model model) {
		Category category = catSer.findCategory(id);
		List<Product> products = proSer.availableProducts(category);
		model.addAttribute("category", category);
		model.addAttribute("products", products);
		return "/categories/show.jsp";
	}
}
