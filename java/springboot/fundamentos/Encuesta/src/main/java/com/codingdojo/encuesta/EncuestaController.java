package com.codingdojo.encuesta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class EncuestaController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.isNew()) {
			List<List<String>> comentarios = new ArrayList<>();
			session.setAttribute("comentarios", comentarios);
		}
		return "index.jsp";
	}
	
	@RequestMapping(value="/procesar", method=RequestMethod.POST)
	public String procesarFormulario(@RequestParam(value="nombre") String nombre,
			@RequestParam(value="ubicacion") String ubicacion,
			@RequestParam(value="lenguaje") String lenguaje,
			@RequestParam(value="comentario") String comentario,
			HttpSession session,
			RedirectAttributes redirectAttributes) {
		
		List<String> err = new ArrayList<>();
		if(nombre.isEmpty()) err.add("Nombre es obligatorio");
		
		if(err.size() > 0) {
			redirectAttributes.addFlashAttribute("error", err);
			return "redirect:/";
		} else {
			@SuppressWarnings("unchecked")
			List<List<String>> comentarios = (List<List<String>>) session.getAttribute("comentarios");
			List<String> com = Arrays.asList(nombre,ubicacion,lenguaje,comentario);
			comentarios.add(com);
			session.setAttribute("comentarios", comentarios);
			return "redirect:/comentarios";
		}
	}
	
	@RequestMapping(value="/comentarios")
	public String mostrarComentarios(HttpSession session) {
		if(session.isNew()) {
			List<List<String>> comentarios = new ArrayList<>();
			session.setAttribute("comentarios", comentarios);
		}
		return "comentarios.jsp";	
	}
}
