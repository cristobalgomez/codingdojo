package com.codingdojo.unoamuchos.repositories;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.unoamuchos.models.Ninja;

@Repository
public interface NinjaRepository extends PagingAndSortingRepository<Ninja, Long>{
}