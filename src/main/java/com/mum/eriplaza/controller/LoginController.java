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
import com.mum.eriplaza.services.UserService;

@Controller
public class LoginController {
	@Autowired
	UserService urs;
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
	return "login";
	}
	

	@RequestMapping("/")
	public String welcome(Model model) {
		
		model.addAttribute("greeting", "EriPlaZa!");
		model.addAttribute("tagline", "A classified advertisements and shopping website with sections devoted to jobs, housing, personals, for sale, items wanted and services");
		
		return "welcome";
	}
	
	
	@RequestMapping("/registration")
	public String welcome( UserDto userDto ,Model model) {
		model.addAttribute("user", userDto);
		//model.addAttribute("greeting", "EriPlaZa!");
		//model.addAttribute("tagline", "A classified advertisements and shopping website with sections devoted to jobs, housing, personals, for sale, items wanted and services");
		
		return "registration";
	}
	@RequestMapping(value="/registration", method=RequestMethod.POST)
	public String processNewUser(@ModelAttribute("user") @Valid UserDto userDto ,BindingResult result , RedirectAttributes rd){
		if(result.hasErrors())
		{
			
			return "registration";
			 
		}
		else{
			User user = new User();
			Address address = new Address(); 
			user.setFname(userDto.getFname());
			user.setLname(userDto.getLname());
			user.setEmail(userDto.getEmail());
			user.setPassword(userDto.getPassword());
			user.setPhone(userDto.getPhone());
			user.setUsername(userDto.getUsername());
			address.setStreet(userDto.getStreet());
			address.setState(userDto.getState());
			address.setZipcode(userDto.getZipcode());
			user.setAddress(address);
			urs.saveUser(user);
			rd.addFlashAttribute(user);
			return "redirect:success";
		}
	}
	@RequestMapping(value="/success",method=RequestMethod.GET)
	public String List(Model model, User user)
	{
		model.addAttribute("user", user);
		return "successSignup";
	}
}
