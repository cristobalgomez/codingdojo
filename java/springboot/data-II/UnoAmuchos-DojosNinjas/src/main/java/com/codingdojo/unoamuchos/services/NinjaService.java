package com.codingdojo.unoamuchos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.unoamuchos.models.Ninja;
import com.codingdojo.unoamuchos.repositories.NinjaRepository;

@Service
public class NinjaService {

	private final NinjaRepository ninjaRepo;
	
	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo = ninjaRepo;
	}
	
	public List<Ninja> allNinjas() {
		return ninjaRepo.findAll();
	}
	
	public Ninja findNinja(Long id) {
		Optional<Ninja> n = ninjaRepo.findById(id);
		if(n.isPresent()) return n.get();
		else return null;
	}
	
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
}
