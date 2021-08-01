package com.codingdojo.unoamuchos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.unoamuchos.models.Dojo;
import com.codingdojo.unoamuchos.models.Ninja;
import com.codingdojo.unoamuchos.services.DojoService;
import com.codingdojo.unoamuchos.services.NinjaService;

@Controller
public class NinjaController {
	private final NinjaService ninjaServ;
	private final DojoService dojoServ;
	
	public NinjaController(NinjaService ninjaServ, DojoService dojoServ) {
		this.ninjaServ = ninjaServ;
		this.dojoServ = dojoServ;
	}
	
	@RequestMapping("/pages/{pageNumber}")
	public String getNinjasPerPage(Model model, @PathVariable("pageNumber") int pageNumber) {
	    //Tenemos que restar 1 porque las páginas iterables empiezan con índice 0. Esto es para que nuestros enlaces puedan mostrarse desde 1...maxPage(última página) 
	    Page<Ninja> ninjas = ninjaServ.ninjasPerPage(pageNumber - 1);
	    //Total número de páginas que tenemos
	    int totalPages = ninjas.getTotalPages();
	    model.addAttribute("totalPages", totalPages);
	    model.addAttribute("ninjas", ninjas);
	    return "ninjas.jsp";
	}


}
