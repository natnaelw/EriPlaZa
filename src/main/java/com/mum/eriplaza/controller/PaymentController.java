package com.mum.eriplaza.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mum.eriplaza.domain.CreditCard;

@Controller
public class PaymentController {
	
	@RequestMapping("/payment")
	public String payment(Model model){
		CreditCard creditCard = new CreditCard();
		model.addAttribute("creditCard", creditCard);
		return "payment";
	}
}
