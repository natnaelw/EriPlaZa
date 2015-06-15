package com.mum.eriplaza.controller;







import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
	public String inputItem(Model model, Item item) {
		
		
		model.addAttribute("categories",categoryService.getAll());	
		
		return "itemList";
	}
	
	 @RequestMapping(value="/additem", method = RequestMethod.POST)
	    public String saveItem(@ModelAttribute Item item)
	    {
	 
		 
	     itemService.save(item);
		 
		 return "successful";
		 
	    }
	 
	 @RequestMapping("/myitemlist")
		public String getItemById(Model model, @RequestParam("id") Long userId) {
 
		//	model.addAttribute("items", itemService.getAllItems(userId));
			return "itemList";
		}
	 
	 @RequestMapping(value = "/item_edit/{id}", method = RequestMethod.GET)
	    public String editBook(Model model, @PathVariable("id") long id) {
	        
//		 List<Category> categories = bookService.getAllCategories();
//	        model.addAttribute("categories", categories);
//	        Book book = bookService.get(id);
//	        model.addAttribute(book);
		 return "itemForm";
}
}
