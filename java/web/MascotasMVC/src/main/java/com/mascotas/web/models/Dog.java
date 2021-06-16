package com.mascotas.web.models;

public class Dog extends Animal implements Pet {
	public Dog(String name, String breed, double weight) {
		super(name, breed, weight);
	}

	@Override
	public String showAffection() {
		String message = "";
		
		if(weight < 30) message = name + " hopped into your lap and cuddled you!";
		else message = name + " curled up next to you!";
		
		return message;

	}
}
