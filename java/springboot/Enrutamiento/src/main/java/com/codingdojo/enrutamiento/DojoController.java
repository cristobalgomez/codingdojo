package com.codingdojo.enrutamiento;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dojo")

public class DojoController {
	
	@RequestMapping("")
	public String index() {
		return "El dojo es increible";
	}
	
	@RequestMapping("/{location}")
	public String printLocation(@PathVariable("location") String location) {
		if(location.equals("burbank-dojo")) {
			return "El dojo burbank esta en en el sur de california";
		} else if(location.equals("san-jose")) {
			return "El dojo san jose es el cuartel general"; 
		} else {
			return "no hay resultados";
		}
	}
//	
//	@RequestMapping("/{campus}")
//	public String printCampus(@PathVariable("campus") String campus) {
//		return "El campus " + campus + " esta en california";
//	}

}
