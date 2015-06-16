package com.mum.eriplaza.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.multipart.MultipartFile;

import com.mum.eriplaza.domain.Item;
import com.mum.eriplaza.services.CategoryService;
import com.mum.eriplaza.services.ItemService;

@Controller
public class ItemController {
	private static final Log logger = LogFactory.getLog(ItemController.class);

	@Autowired
	private CategoryService categoryService;

	@Autowired
	private ItemService itemService;

	@RequestMapping(value = "/additem", method = RequestMethod.GET)
	public String inputItem(Model model, Item item) {
		
		model.addAttribute("categories", categoryService.findAll());

		return "itemForm";
	}

	@RequestMapping(value = "/additem", method = RequestMethod.POST)
	public String saveItem(@ModelAttribute("item") Item item, BindingResult result ,HttpServletRequest request) {


		MultipartFile itemImage = item.getItemImage();
	//  String rootDirectory = request.getSession().getServletContext().getRealPath("/");

		if (itemImage != null && !itemImage.isEmpty()) {
			
			try {
				
			    // itemImage.transferTo(new File(rootDirectory+ "\\resources\\images\\" + item.getItemName() + ".png"));
				itemImage.transferTo(new File("E:\\resources\\images\\" + item.getItemName() + ".png"));

				 item.setItemPath("E:\\resources\\images\\" + item.getItemName() + ".png");

			} catch (Exception e) {
				throw new RuntimeException("Employee Image saving failed", e);

			}
		}

		
		itemService.save(item);

		return "successful";

	}

	@RequestMapping("/myitemlist")
	public String getItemById(Model model, @RequestParam("id") Long userId) {

		// model.addAttribute("items", itemService.getAllItems(userId));
		return "itemList";
	}

	@RequestMapping(value = "/item_edit/{id}", method = RequestMethod.GET)
	public String editItem(Model model, @PathVariable("id") long id) {

		// model.addAttribute("item",itemService.find(id));
		return "itemForm";
	}
}
