package com.codingdojo.countries.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.countries.models.Country;

@Repository
public interface CountryRepository extends CrudRepository<Country, Long> {
	List<Country> findAll();
	
	@Query("SELECT c FROM Country c JOIN c.languages l WHERE l.language = ?1 ORDER BY l.percentage DESC")
	List<Country> languageSpeakingCountries(String language);
//	
	@Query("SELECT c, count(s.name) FROM Country c JOIN c.cities s GROUP BY c.id ORDER BY count(s.name) DESC")
	List<Object[]> numberOfCitiesByCountries();
	
	@Query("SELECT c FROM Country c WHERE c.population >= ?1 AND c.surfaceArea < ?2")
	List<Country> countryByPopulationAndSurface(Integer population, Double surfaceArea);
	
	@Query("SELECT c FROM Country c WHERE c.governmentForm = ?1 AND c.surfaceArea >= ?2 AND c.lifeExpectancy >= ?3")
	List<Country> countryByGovernmentFormAndSurfaceAreaAndLifeExpectancy(String governmentForm, Double surfaceArea, Double lifeExpectancy);
	
	@Query("SELECT c.region, count(c.name) FROM Country c GROUP BY c.region ORDER BY count(c.name) DESC")
	List<Object[]> numberOfCountriesByContinent();
	
}
