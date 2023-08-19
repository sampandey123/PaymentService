package com.shiva.ps.api.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shiva.ps.api.entity.Payment;
import com.shiva.ps.api.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository paymentRepo;
	
	public Payment savePayment(Payment payment) {
		payment.setTransactionId(UUID.randomUUID().toString());
		
		String paymentStatus = (doPaymentStatus())?"Success":"Fail";
		payment.setPaymentStatus(paymentStatus);
		
		return paymentRepo.save(payment);
	}
	
	//rest call to PayPal, UPI or any other banks. Dummy for now. 
	public boolean doPaymentStatus() {
		
		return new Random().nextBoolean();
	}
}
