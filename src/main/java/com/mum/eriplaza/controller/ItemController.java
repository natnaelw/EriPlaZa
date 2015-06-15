package com.mum.eriplaza.controller;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.bind.annotation.RequestMethod;


import com.mum.eriplaza.domain.Item;
import com.mum.eriplaza.services.CategoryService;


@Controller
public class ItemController {
	@Autowired
	CategoryService categoryService;
	String name;

	@RequestMapping(value = "/post")
	public String inputItem(Model model) {
		
		Item item = new Item();		
		model.addAttribute("item", item);
	
//		List<String> categories = categoryService.getAll();
//		model.addAttribute("categories", categories);
		
		
		
		return "itemAdd";
	}
	
	 @RequestMapping(value="/post", method = RequestMethod.POST)
	    public String saveItem( @ModelAttribute Item item, BindingResult bindingResult,
	    		Model model){ 
		 
		 model.addAttribute("item", item);
         
	      
	        return "itemDetails";
	    }
}
