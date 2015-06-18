package com.mum.eriplaza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mum.eriplaza.domain.Item;
import com.mum.eriplaza.services.CategoryService;
import com.mum.eriplaza.services.ItemService;

/**
 * @author Na2
 *
 */
@Controller
public class SearchController {

	@Autowired
	CategoryService categoryService;
	@Autowired
	ItemService itemService;

	
	
	@RequestMapping("/search")
	public String search(Model model,@ModelAttribute Item item){
		model.addAttribute("items", itemService.findItemsByCategory(Long.parseLong("1")));
		model.addAttribute("categories", categoryService.findAll());
		return "search";
	}
	
	@RequestMapping(value ="/searchByCategory")
	public String getProductsByCategory(Model model,@RequestParam("categoryId")String categoryId) {
		
		model.addAttribute("items", itemService.findItemsByCategory(Long.parseLong(categoryId)));
		return "items";
	}
	

}
