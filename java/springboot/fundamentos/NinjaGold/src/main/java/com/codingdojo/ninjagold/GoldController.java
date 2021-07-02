package com.codingdojo.ninjagold;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class GoldController {
	@RequestMapping("/oro")
	public String mostrarOro(HttpSession session) {
		if(session.isNew()) {
			List<String> actividad = new ArrayList<>();
			session.setAttribute("actividad", actividad);
			session.setAttribute("oro", 0);
		}
		return "index.jsp";
		
	}
	@RequestMapping(value="/generarOro", method=RequestMethod.POST)
	public String generarOro(@RequestParam(value="lugar") String lugar, HttpSession session) {
		Random r = new Random();
		int oro = (int) session.getAttribute("oro");
		int oroGenerado = 0;
		@SuppressWarnings("unchecked")
		List<String> actividad = (List<String>) session.getAttribute("actividad");
		String visita = "";
		
		if(lugar.equals("granja")) {
			oroGenerado = r.nextInt(10) + 10;
			visita = "la granja";
		}
		else if(lugar.equals("cueva")) {
			oroGenerado = r.nextInt(5) + 5;
			visita = "la cueva";
		}
		else if(lugar.equals("casa")) {
			oroGenerado = r.nextInt(3) + 2;
			visita = "la casa";
		}
		else if(lugar.equals("casino")) {
			oroGenerado = r.nextInt(50) * (r .nextBoolean() ? -1 : 1);
			visita = "el casino";
		} else if(lugar.equals("reset")) {
			session.setAttribute("actividad", new ArrayList<>());
			session.setAttribute("oro", 0);
			return "redirect:/oro";
		}
		
		if(oroGenerado > 0) actividad.add("gana;Has visitado " + visita + " y recolectaste " + oroGenerado + " monedas de oro - " + new Date());
		else actividad.add("pierde;Has visitado " + visita + " y perdiste " + Math.abs(oroGenerado) + " monedas de oro :'( - " + new Date());
		
		session.setAttribute("actividad", actividad);
		session.setAttribute("oro", oro + oroGenerado);
		return "redirect:/oro";
	}
}
