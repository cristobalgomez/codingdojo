package com.mascotas.web.models;

public class Cat extends Animal implements Pet {
	public Cat(String name, String breed, double weight) {
		super(name, breed, weight);
	}

	@Override
	public String showAffection() {
		return name + ", a " + breed + " cat, looked at you with some affection... Who knows";
	}
}
