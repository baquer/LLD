package org.example;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public void pay(Integer amount) {
        System.out.println("Payment Processed with amount " + amount + "via credit card");
    }
}
