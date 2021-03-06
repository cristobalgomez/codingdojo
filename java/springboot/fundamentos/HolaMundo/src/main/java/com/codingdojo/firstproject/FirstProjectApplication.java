package com.codingdojo.firstproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}
	
	@RequestMapping("/")
	public String hello() {
		return "Hola Hola, q tal?";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "Esta es mi primera aplicacion en springboot";
	}


}
