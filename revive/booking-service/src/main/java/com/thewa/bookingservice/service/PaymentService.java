package com.thewa.bookingservice.service;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;
import com.stripe.param.PaymentIntentCreateParams;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
  @Value("${stripe.api-key}")
  private String stripeApiKey;
  
  @PostConstruct
  public void init() {
	Stripe.apiKey = stripeApiKey;
  }
  
  public String createPaymentIntent(double amount, String currency) throws StripeException {
	PaymentIntentCreateParams params = PaymentIntentCreateParams.builder()
																.setAmount((long) (amount*100)) // Amount in cents
																.setCurrency(currency)
																.build();
	
	PaymentIntent paymentIntent = PaymentIntent.create(params);
	return paymentIntent.getClientSecret();
  }
}