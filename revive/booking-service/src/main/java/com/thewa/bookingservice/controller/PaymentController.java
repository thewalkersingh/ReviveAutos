package com.thewa.bookingservice.controller;
import com.thewa.bookingservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {
  @Autowired
  private PaymentService paymentService;
  
  @PostMapping("/create-payment-intent")
  public String createPaymentIntent(@RequestParam double amount, @RequestParam String currency) {
	try {
	  return paymentService.createPaymentIntent(amount, currency);
	} catch (Exception e) {
	  throw new RuntimeException("Payment processing failed: " + e.getMessage());
	}
  }
}