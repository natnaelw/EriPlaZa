package com.mum.eriplaza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.mum.eriplaza.services.CategoryService;

@Controller
public class ItemController {
	@Autowired
	CategoryService categoryService;

	@RequestMapping(value = "/post")
	public String inputItem(Model model) {

		List<String> categories = categoryService.getAll();
		model.addAttribute("categories", categories);

		return "itemAdd";
	}
}
