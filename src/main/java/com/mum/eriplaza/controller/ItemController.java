package com.mum.eriplaza.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.mum.eriplaza.domain.Category;
import com.mum.eriplaza.domain.Item;
import com.mum.eriplaza.domain.User;
import com.mum.eriplaza.services.CategoryService;
import com.mum.eriplaza.services.ItemService;
import com.mum.eriplaza.services.UserService;

@Controller
public class ItemController {
	

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private ItemService itemService;
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping(value="/userpage", method = RequestMethod.GET)
	public String userPage(Model model , @RequestParam("id") String userId) {

		model.addAttribute("user",userService.getUser(Long.parseLong(userId)));
		model.addAttribute("userItem", itemService.getAllItems(Long.parseLong(userId)));
     
		return "usersHome";
	}
	

	@RequestMapping(value = "/items/add", method = RequestMethod.GET)
	public String inputItem(@ModelAttribute Item item, @RequestParam("id") String userId, Model model) {		
		model.addAttribute("user",userService.getUser(Long.parseLong(userId)));
		
		model.addAttribute("userItem", itemService.getAllItems(Long.parseLong(userId)));

		return "itemForm";
	}

			
	@RequestMapping(value = "/items/add", method = RequestMethod.POST)
	public String saveItem(@Valid @ModelAttribute Item item, BindingResult result ,HttpServletRequest request ,
			@RequestParam("id") String id,Model model) {
	
		if(result.hasErrors()){
			model.addAttribute("categories", categoryService.findAll());
			return "itemForm";
		}
		
		
		MultipartFile itemImage = item.getItemImage();
		//MultipartFile itemImageCopy = item.getItemImage();

		String rootDirectory = request.getSession().getServletContext()
				.getRealPath("/");

		if (itemImage != null && !itemImage.isEmpty()) {

			try {

				System.out.println("----" + rootDirectory);
				
				
				item.setItemPath("E:\\resources\\images\\" + item.getItemName()
						+ ".png");
//				itemImage.transferTo(new File("E:\\resources\\images\\"
//						+ item.getItemName() + ".png"));
				
				itemImage.transferTo(new File(rootDirectory
								+ "\\resources\\images\\" + item.getItemName()
								+ ".png"));
				
			}
         catch (Exception e) {
			throw new RuntimeException("Employee Image saving failed", e);
		}
				
		}	
		Category cat = categoryService.find(item.getCategory().getId());
		
		cat.addItems(item);
		User user=userService.getUser(Long.parseLong(id));
		user.addItems(item);
		
		userService.saveUser(user);
		
        model.addAttribute("success" ,"item has been succesfully added to Your List");
		model.addAttribute("user",userService.getUser(Long.parseLong(id)));
		model.addAttribute("userItem", itemService.getAllItems(Long.parseLong(id)));
       
		return "usersHome";

	}
	
	@RequestMapping(value = "/edit/item" , method = RequestMethod.GET)
	public String editItem(Item item ,Model model,@RequestParam("id") String id ,@RequestParam("userid") String userid) {
		    	   
	   model.addAttribute("edititems" ,itemService.find(Long.parseLong(id)));
	   model.addAttribute("user",userService.getUser(Long.parseLong(userid)));
	   model.addAttribute("userItem", itemService.getAllItems(Long.parseLong(userid)));
	      
		return "itemEdit";
	}
	
	
	@RequestMapping(value = "/edit/item", method = RequestMethod.POST)
    public String editItem(@Valid @ModelAttribute Item item ,BindingResult result,@RequestParam("id") String id,@RequestParam("userid")String userid ,Model model) {
		
		if(result.hasErrors()){	   
		    model.addAttribute("edititems" ,itemService.find(Long.parseLong(id)));
			
			return "itemEdit";
		}
		
		Item newitem=itemService.find(Long.parseLong(id));	
		
		newitem.setCategory(item.getCategory());
		newitem.setDescription(item.getDescription());
		newitem.setItemCondition(item.getItemCondition());
		newitem.setItemName(item.getItemName());
		newitem.setUnitPrice(item.getUnitPrice());
		newitem.setItemPath(item.getItemPath());
		newitem.setUnitsInStock(item.getUnitsInStock());
			
		itemService.save(newitem);
			
		model.addAttribute("user",userService.getUser(Long.parseLong(userid)));
		model.addAttribute("userItem", itemService.getAllItems(Long.parseLong(userid)));
		
		return "usersHome";
	
	}

	@RequestMapping(value="/myitemlist", method = RequestMethod.GET)
	public String getItemById(Model model , @RequestParam("id") String userId) {

	    model.addAttribute("userItem", itemService.getAllItems(Long.parseLong(userId)));
	    model.addAttribute("userid",userId);
	    model.addAttribute("user",userService.getUser(Long.parseLong(userId)));
	    
		return "itemList";
	}
	
	 @ModelAttribute
	 public void init(Model model){
		 model.addAttribute("items",itemService.findAll());
		 model.addAttribute("categories", categoryService.findAll());	 
	 }

}
	
