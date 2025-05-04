package org.example;

public class PaymentLayer {
    Payment payment;

    void setPayment(Payment payment) {
       this.payment = payment;
    }
    void doPayment(int amount) {
        payment.pay(amount);
    }
}
