package com.codingdojo.countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.countries.models.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {
	List<City> findAll();
	
	@Query("SELECT s FROM City s JOIN s.country c WHERE c.name = ?1 AND s.population >= ?2 ORDER BY c.population DESC")
	List<City> allCitiesByCountryAndPopulation(String country, Integer population);
	
	@Query("SELECT s FROM City s JOIN s.country c WHERE c.name = ?1 AND s.district = ?2 AND s.population >= ?3")
	List<City> citiesByCountryDistrictAndPopulation(String name, String district, Integer population);
}
