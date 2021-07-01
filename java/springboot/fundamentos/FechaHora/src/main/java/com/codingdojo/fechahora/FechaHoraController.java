package com.codingdojo.fechahora;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class FechaHoraController {
	
	@RequestMapping("/")
	public String home(Model model) {
		
		return "index.jsp";
	}
	@RequestMapping("/date")
	
	public String viewDate(Model model) {
		
		model.addAttribute("date",  new Date());
		return "fecha.jsp";
	}
	@RequestMapping("/time")
	public String viewTime(Model model) {
		model.addAttribute("date",  new Date());
		return "hora.jsp";
	}



}
