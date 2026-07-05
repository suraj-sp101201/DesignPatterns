package com.example.designpatterns.behavioural.strategy;

public class PaymentService {
    private PaymentStrategy paymentStrategy;
    PaymentService(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public String pay(Double amount) {
        return paymentStrategy.pay(amount);
    }
}
