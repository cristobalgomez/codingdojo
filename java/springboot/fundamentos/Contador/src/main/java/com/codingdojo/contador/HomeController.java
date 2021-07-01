package com.codingdojo.contador;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.isNew()) {
			session.setAttribute("numeroVisitas", 1);
		} else {
			int numeroVisitas = (int) session.getAttribute("numeroVisitas");
			session.setAttribute("numeroVisitas", ++numeroVisitas);
		}
		return "index.jsp";
	}
	
	@RequestMapping("porDos")
	public String mostrarContadorPorDos(HttpSession session) {
		if(session.isNew()) {
			session.setAttribute("numeroVisitas", 2);
		} else {
			int numeroVisitas = (int) session.getAttribute("numeroVisitas");
			session.setAttribute("numeroVisitas",(numeroVisitas+2));
		}
		return "index.jsp";
	}
	
	@RequestMapping("reset")
	public String reset(HttpSession session) {
		session.setAttribute("numeroVisitas", 0);
		return "index.jsp";
	}
	
	@RequestMapping("contador")
	public String mostrarContador() {
		return "contador.jsp";
	}
}
