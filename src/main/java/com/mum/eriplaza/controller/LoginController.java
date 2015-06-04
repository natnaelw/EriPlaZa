package com.mum.eriplaza.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("greeting", "EriPlaZa!");
		model.addAttribute("tagline", "A classified advertisements and shopping website with sections devoted to jobs, housing, personals, for sale, items wanted and services");
		
		return "welcome";
	}
}
