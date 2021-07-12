package com.codingdojo.muchosamuchos.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.muchosamuchos.models.Category;
import com.codingdojo.muchosamuchos.models.Product;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {
	List<Category> findAll();
	List<Category> findByProductsNotContaining(Product product);
}
