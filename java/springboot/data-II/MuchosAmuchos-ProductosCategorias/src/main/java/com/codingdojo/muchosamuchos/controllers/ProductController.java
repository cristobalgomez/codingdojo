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
public class ProductController {
	private final ProductService proSer;
	private final CategoryService catSer;
	
	public ProductController(ProductService proSer, CategoryService catSer) {
		this.proSer = proSer;
		this.catSer = catSer;
	}
	
	@RequestMapping("/products")
	public String create(Model model) {
		List<Product> products = proSer.allProducts();
		model.addAttribute("products", products);
		return "/products/index.jsp";
		
	}
	
	@RequestMapping("/products/new")
	public String create(@ModelAttribute("product") Product product) {
		return "/products/new.jsp";
	}
	
	@RequestMapping(value="/products/new", method=RequestMethod.POST)
	public String postProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "/products/new.jsp";
		} else {
			proSer.createProduct(product);
			return "redirect:/products";
		}
	}
	
	@RequestMapping("/products/{id}")
	public String product(@ModelAttribute("categoryProduct") CategoryProduct catPro, @PathVariable("id") Long id, Model model) {
		Product product = proSer.findProduct(id);
		List<Category> categories = catSer.availableCategories(product);
		model.addAttribute("categories", categories);
		model.addAttribute("product", product);
		return "/products/show.jsp";
	}
	
}
