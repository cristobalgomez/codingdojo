package com.codingdojo.muchosamuchos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.muchosamuchos.models.Category;
import com.codingdojo.muchosamuchos.models.Product;
import com.codingdojo.muchosamuchos.repositories.ProductRepository;

@Service
public class ProductService {
	private final ProductRepository proRepo;
	
	public ProductService(ProductRepository proRepo) {
		this.proRepo = proRepo;
	}
	
	public List<Product> allProducts() {
		return proRepo.findAll();
	}
	
	public Product findProduct(Long id) {
		Optional<Product> product = proRepo.findById(id);
		if(product.isPresent()) return product.get();
		else return null;
	}
	
	public Product createProduct(Product product) {
		return proRepo.save(product);
	}
	
	public List<Product> availableProducts(Category category) {
		return proRepo.findByCategoriesNotContaining(category);
	}
}
