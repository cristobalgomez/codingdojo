package com.codingdojo.muchosamuchos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.muchosamuchos.models.Category;
import com.codingdojo.muchosamuchos.models.Product;
import com.codingdojo.muchosamuchos.repositories.CategoryRepository;

@Service
public class CategoryService {
	private final CategoryRepository catRepo;
	
	public CategoryService(CategoryRepository catRepo) {
		this.catRepo = catRepo;
	}
	
	public List<Category> allCategories() {
		return catRepo.findAll();
	}
	
	public Category findCategory(Long id) {
		Optional<Category> category = catRepo.findById(id);
		if(category.isPresent()) return category.get();
		else return null;
	}
	
	public Category createCategory(Category category) {
		return catRepo.save(category);
	}
	
	public List<Category> availableCategories(Product product) {
		return catRepo.findByProductsNotContaining(product);
	}
}
