package com.mum.eriplaza.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;	
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.mum.eriplaza.domain.Address;
import com.mum.eriplaza.domain.User;
import com.mum.eriplaza.domain.UserDto;
import com.mum.eriplaza.services.CategoryService;
import com.mum.eriplaza.services.ItemService;
import com.mum.eriplaza.services.UserService;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ItemService itemService;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login() {
	return "login";
	}
	@RequestMapping(value="/loginfailed", method =
	RequestMethod.GET)
	public String loginerror(Model model) {
	model.addAttribute("error", "true");
	return "login";
	}
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(Model model) {
	return "redirect:/welcome";
	}
		
	@RequestMapping(value="/usersHome",method=RequestMethod.GET)
	public String List()
	{
		return "usersHome";
	}
	
	@RequestMapping(value="/registration", method=RequestMethod.GET)
	public String signup(@ModelAttribute("newUser")User user){
		
		return "registration";
	}
	
	@RequestMapping(value="/registration", method=RequestMethod.POST)
	public String processSignUp(@Valid @ModelAttribute("newUser")User user,BindingResult result){
		if(result.hasErrors()){
			return "registration";
		}
		
		userService.addNewUser(user);
		
		return "redirect:/welcome";
	}
	
	@ModelAttribute
	public void init(Model model){
		model.addAttribute("items",itemService.findAll());
		model.addAttribute("categories",categoryService.findAll());
	}
}
