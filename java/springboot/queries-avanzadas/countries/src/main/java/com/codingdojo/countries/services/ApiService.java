package com.codingdojo.countries.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codingdojo.countries.models.City;
import com.codingdojo.countries.models.Country;
import com.codingdojo.countries.repositories.CityRepository;
import com.codingdojo.countries.repositories.CountryRepository;
import com.codingdojo.countries.repositories.LanguageRepository;

@Service
public class ApiService {
	private final CityRepository cityRepo;
	private final CountryRepository countryRepo;
	private final LanguageRepository langRepo;
	
	public ApiService(CityRepository cityRepo, CountryRepository countryRepo, LanguageRepository langRepo) {
		this.cityRepo = cityRepo;
		this.countryRepo = countryRepo;
		this.langRepo = langRepo;
	}
	
	public List<Country> sloveneSpeakingCountries() {
		return countryRepo.languageSpeakingCountries("Slovene");
	}
//	
	public List<Object[]> numberOfCities() {
		return countryRepo.numberOfCitiesByCountries();
	}
	
	public List<City> mexicanCitiesOver500k() {
		return cityRepo.allCitiesByCountryAndPopulation("Mexico", 500000);
	}
	
	public List<Country> countriesByPopOver100AndSurfaceUnder501() {
		return countryRepo.countryByPopulationAndSurface(100000, 501.0);
	}
	
	public List<Country> monarchyCountries() {
		return countryRepo.countryByGovernmentFormAndSurfaceAreaAndLifeExpectancy("Constitutional Monarchy", 200.0, 75.0);
	}
	
	public List<City> argentinianCitiesInBuenosAires() {
		return cityRepo.citiesByCountryDistrictAndPopulation("Argentina", "Buenos Aires", 500000);
	}
	
	public List<Object[]> languagesByPercentageOver89() {
		return langRepo.languagesByPercentage(89.0);
	}
	
	public List<Object[]> countriesByRegion() {
		return countryRepo.numberOfCountriesByContinent();
	}

}
