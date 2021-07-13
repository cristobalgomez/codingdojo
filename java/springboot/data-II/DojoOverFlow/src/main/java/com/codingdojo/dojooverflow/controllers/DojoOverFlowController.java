package com.codingdojo.dojooverflow.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.dojooverflow.models.Answer;
import com.codingdojo.dojooverflow.models.Question;
import com.codingdojo.dojooverflow.services.MainService;

@Controller
public class DojoOverFlowController {
	private final MainService service;
	
	public DojoOverFlowController(MainService service) {
		this.service = service;
	}
	
	@RequestMapping("/questions")
	public String index(Model model) {
		List<Question> questions = service.allQuestions();
		model.addAttribute("questions", questions);
		return "/views/index.jsp";
	}
	
	@RequestMapping("/questions/new")
	public String create(@ModelAttribute("createQuestion") Question question) {
		return "/views/new.jsp";
	}
	
	@PostMapping("/questions/new")
	public String postQuestion(@Valid @ModelAttribute("createQuestion") Question question, BindingResult result, @RequestParam("questionTags") String tags) {
		if(result.hasErrors()) {
			return "/views/new.jsp";
		} else {
			service.createQuestionWithTags(question, tags);
			return "redirect:/questions";
		}
	}
	
	@RequestMapping("/questions/{id}")
	public String show(@ModelAttribute("createAnswer") Answer answer, @PathVariable("id") Long id, Model model) {
		Question question = service.findQuestion(id);
		model.addAttribute("question", question);
		return "/views/question.jsp";
	}
	
	@PostMapping("/questions/{id}")
	public String postAnswer(@PathVariable("id") Long id, @Valid @ModelAttribute("createAnswer") Answer answer, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("question", service.findQuestion(id));
			return "/views/question.jsp";
		} else {
			service.createAnswer(answer);
			return "redirect:/questions/" + id;
		}
	}
	
}
