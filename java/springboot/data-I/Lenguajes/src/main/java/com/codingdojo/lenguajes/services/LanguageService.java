package com.codingdojo.lenguajes.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.lenguajes.models.Language;
import com.codingdojo.lenguajes.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository lanRepo;
	
	public LanguageService(LanguageRepository lanRepo) {
		this.lanRepo = lanRepo;
	}
	
	public List<Language> allLanguages() {
		return lanRepo.findAll();
	}
	
	public Language createLanguage(Language lan) {
		return lanRepo.save(lan);
	}
	
	public Language findLanguage(Long id) {
		Optional<Language> optionalLanguage = lanRepo.findById(id);
		if(optionalLanguage.isPresent()) return optionalLanguage.get();
		else return null;
	}
	
	public void deleteLanguage(Long id) {
		lanRepo.deleteById(id);
	}
}
