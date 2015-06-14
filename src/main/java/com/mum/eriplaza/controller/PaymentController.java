package com.mum.eriplaza.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaymentController {
	
	@RequestMapping("/payment")
	public String payment(Model model){
		System.out.println("payment processing");
		return "payment";
	}
}
