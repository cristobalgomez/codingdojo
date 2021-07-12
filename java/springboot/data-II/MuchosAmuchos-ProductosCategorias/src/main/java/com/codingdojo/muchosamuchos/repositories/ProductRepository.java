package com.codingdojo.muchosamuchos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.muchosamuchos.models.Category;
import com.codingdojo.muchosamuchos.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	List<Product> findAll();
	List<Product> findByCategoriesNotContaining(Category category);
}
