package com.mum.eriplaza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mum.eriplaza.domain.Category;
import com.mum.eriplaza.domain.Item;
import com.mum.eriplaza.services.CategoryService;
import com.mum.eriplaza.services.ItemService;


@Controller
public class ItemController {
	
	@Autowired
	 private CategoryService categoryService;
	
	@Autowired
	 private ItemService itemService;
	


	@RequestMapping(value = "/additem" ,method = RequestMethod.GET)
	public String inputItem(Model model) {
		
		Item item = new Item();		
		model.addAttribute("item", item);
	
		
		model.addAttribute("categories", categoryService.getAll());
		
		
		
		return "itemForm";
	}
	
	 @RequestMapping(value="/additem", method = RequestMethod.POST)
	    public String saveItem(@ModelAttribute Item item)
	    {
	//	 Category category = categoryService.getCategory(item.getCategory().getItemId());
	//     item.setCategory(category);
		 
	    		
	     itemService.save(item);
		 
		 return "successful";
		 
	    }
}
