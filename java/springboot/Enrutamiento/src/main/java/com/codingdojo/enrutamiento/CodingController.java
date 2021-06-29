package com.codingdojo.enrutamiento;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding")

public class CodingController {
	@RequestMapping("")
	public String index() {
		return "Hola Coding Dojo";
	}
	@RequestMapping("/python")
	public String imprimirPython() {
		return "python/django esta ok";
	}
	@RequestMapping("/java")
	public String imprimirJava() {
		return "java/spring es mejor";
	}

}
