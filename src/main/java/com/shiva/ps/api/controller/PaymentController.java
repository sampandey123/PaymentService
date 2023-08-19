package com.shiva.ps.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shiva.ps.api.entity.Payment;
import com.shiva.ps.api.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	
	@PostMapping("/doPayment")
	public Payment savePayment(@RequestBody Payment payment) {
		
		return paymentService.savePayment(payment);
	}
	
}
