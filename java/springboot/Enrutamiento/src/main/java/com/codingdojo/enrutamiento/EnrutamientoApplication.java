package com.codingdojo.enrutamiento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
// @RestController
public class EnrutamientoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EnrutamientoApplication.class, args);
	}

//	@RequestMapping("/")
//	public String index() {
//		return "Hola";
//	}

}
