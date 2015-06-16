package com.mum.eriplaza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mum.eriplaza.domain.Category;
import com.mum.eriplaza.domain.Item;
import com.mum.eriplaza.services.CategoryService;
import com.mum.eriplaza.services.ItemService;



@Controller
public class HomeController {

	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ItemService itemService;
	
	@RequestMapping(value={"/","/welcome"})
	public String welcome(Model model,@ModelAttribute("categories") Category category) {
		List<Category> categories= categoryService.findAll();
		List<Item> items = itemService.findAll();
		model.addAttribute("items",items);
		model.addAttribute("categories",categories);
		model.addAttribute("greeting", "EriPlaZa!");
		model.addAttribute("tagline", "A classified advertisements and shopping website with sections devoted to jobs, housing, personals, for sale, items wanted and services");
		return "welcome";
	}
}
