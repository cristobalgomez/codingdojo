package com.codingdojo.unoauno.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.unoauno.models.Person;
import com.codingdojo.unoauno.repositories.PersonRepository;

@Service
public class PersonService {
	private final PersonRepository personRepo;
	
	public PersonService(PersonRepository personRepo) {
		this.personRepo = personRepo;
	}
	
	public List<Person> allPeople() {
		return personRepo.findAll();
	}
	
	public Person findPerson(Long id) {
		Optional<Person> person = personRepo.findById(id);
		if(person.isPresent()) return person.get();
		else return null;
	}
	
	public Person createPerson(Person person) {
		return personRepo.save(person);
	}

}
