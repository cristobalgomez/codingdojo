package com.codingdojo.elcodigo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller

public class CodigoController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.isNew()) {
			session.setAttribute("acceso", false);
		}
		return "index.jsp";
	}
	
	@RequestMapping(value="/codigo", method=RequestMethod.POST)
	public String comprobarCodigo(@RequestParam(value="codigo") String codigo, RedirectAttributes redirectAttributes) {
		if(codigo.equals("boshido")) {
			return "codigo.jsp";
		} else {
			redirectAttributes.addFlashAttribute("error", "Codigo no valido");
			return "redirect:/";
		}
	}
	
}
