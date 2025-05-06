package org.example;

public class UpiPaymentStrategy implements Payment{
    @Override
    public void pay(Integer amount) {
        System.out.println("Payment Processed with amount " + amount + "via UPI");
    }
}
