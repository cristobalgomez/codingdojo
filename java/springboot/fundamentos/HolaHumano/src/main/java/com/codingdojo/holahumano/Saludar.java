package com.codingdojo.holahumano;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Saludar {
	@RequestMapping("/")
	public String index(@RequestParam(value="firstName",required=false) String firstName,
			@RequestParam(value="lastName",required=false) String lastName) {
		firstName = firstName != null ? firstName : "Humano";
		lastName = lastName != null ? lastName : "";
		return "<h1>Hola " + firstName.concat(" "+lastName) + "!</h1><h4>Bienvenido a Springboot</h4>";
	}
}
