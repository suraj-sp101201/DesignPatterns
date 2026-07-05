package com.example.designpatterns.behavioural.strategy;

public class UpiPaymentStrategy implements PaymentStrategy{
    @Override
    public String pay(Double amount) {
        System.out.println("Payed through UPI");
        return "Success";
    }
}
