package com.mum.eriplaza.controller;

import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mum.eriplaza.domain.CreditCard;
import com.mum.eriplaza.domain.Item;
import com.mum.eriplaza.domain.Order;
import com.mum.eriplaza.services.ItemService;

/**
 * @author Filmon
 *
 */
@Controller
public class PaymentController {

	@Autowired
	private ItemService itemService;

	@RequestMapping("/payment")
	public String payment(Model model) {
		return "payment";
	}

	/**
	 * @param model
	 *            Initializes model with a list of credit card types, list of
	 *            months, and new credit card object
	 */
	@ModelAttribute
	private void initializeModel(Model model) {
		CreditCard creditCard = new CreditCard();
		model.addAttribute("creditCard", creditCard);

		List<String> creditCardTypes = new ArrayList<String>();
		creditCardTypes.add("Debit");
		creditCardTypes.add("Credit");
		model.addAttribute("creditCardTypes", creditCardTypes);

		List<String> months = new ArrayList<String>();
		for (int i = 0; i < 12; i++) {
			months.add(new DateFormatSymbols().getShortMonths()[i]);
		}
		model.addAttribute("months", months);
	}

	/**
	 * @param creditCard
	 * @param result
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/payment", method = RequestMethod.POST)
	public String processPayment(
			@ModelAttribute("creditCard") @Valid CreditCard creditCard,
			BindingResult result, Model model) {
		model.addAttribute("thankyou",
				"Thank you for shopping with us. Your order was processed successfully.");
		return "payment";
	}

	@RequestMapping("/items/item")
	public String getProductById(Model model, @RequestParam("id") String itemId) {
		Order order = new Order();
		List<Item> items = new ArrayList<Item>();

		Item itemToCheckout = itemService.find(Long.parseLong(itemId));

		items.add(itemToCheckout);
		order.setItemsInOrder(items);
		model.addAttribute("item", itemToCheckout);
		return "payment";
	}
}
