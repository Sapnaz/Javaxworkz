package com.xworkz.datatypes.things;

import com.xworkz.datatypes.CreditCardPayment;
import com.xworkz.datatypes.PayPalPayment;
import com.xworkz.datatypes.Payment;

public class PaymentRunner {

	public static void main(String[] args) {
		
		        Payment payment1 = new Payment();
		        Payment payment2 = new CreditCardPayment();
		        Payment payment3 = new PayPalPayment();

		        payment1.makePayment();  // Output: Processing generic payment
		        payment2.makePayment();  // Output: Processing credit card payment
		        payment3.makePayment();  // Output: Processing PayPal payment
		    }
		}

	

	


