package com.codingdojo.muchosamuchos.services;

import org.springframework.stereotype.Service;

import com.codingdojo.muchosamuchos.models.CategoryProduct;
import com.codingdojo.muchosamuchos.repositories.CategoryProductRepository;

@Service
public class CategoryProductService {
	private final CategoryProductRepository catProRepo;
	
	public CategoryProductService(CategoryProductRepository catProRepo) {
		this.catProRepo = catProRepo;
	}
	
	public CategoryProduct createCategoryProduct(CategoryProduct categoryProduct) {
		return catProRepo.save(categoryProduct);
	}
}
