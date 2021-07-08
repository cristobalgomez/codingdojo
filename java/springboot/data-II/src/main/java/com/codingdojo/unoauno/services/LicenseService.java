package com.codingdojo.unoauno.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.unoauno.models.License;
import com.codingdojo.unoauno.repositories.LicenseRepository;

@Service
public class LicenseService {
	private final LicenseRepository licRepo;
	
	public LicenseService(LicenseRepository licRepo) {
		this.licRepo = licRepo;
	}
	
	public List<License> allLicenses() {
		return licRepo.findAll();
	}
	
	public License findLicense(Long id) {
		Optional<License> license = licRepo.findById(id);
		if(license.isPresent()) return license.get();
		else return null;
	}
	
	public License createLicense(License l) {
		return licRepo.save(l);
	}
}
