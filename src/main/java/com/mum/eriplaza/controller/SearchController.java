package com.mum.eriplaza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mum.eriplaza.domain.Category;
import com.mum.eriplaza.domain.Item;
import com.mum.eriplaza.services.CategoryService;
import com.mum.eriplaza.services.ItemService;

@Controller
public class SearchController {

	@Autowired
	CategoryService categoryService;
	@Autowired
	ItemService itemService;

	@RequestMapping("/search")
	public String search(Model model){
		List<Category> categories = categoryService.findAll();
		for (Category category : categories) {
			System.out.println("---*"+category);
		}
		model.addAttribute("categories", categories);
		return "search";
	}
	
	@RequestMapping(value ="/searchByCategory")
	public String getProductsByCategory(Model model,@RequestParam("categoryId")String categoryId) {

		List<Item> items = itemService.findItemsByCategory(Long.parseLong(categoryId));
        for (Item item : items) {
			System.out.println("--"+item);
		}
		model.addAttribute("items", items);
		return "items";
	}

}
