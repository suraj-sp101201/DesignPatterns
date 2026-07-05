package com.example.designpatterns.behavioural.strategy;

public class CreditcardPaymentStrategy implements PaymentStrategy{
    @Override
    public String pay(Double amount) {
        System.out.println("Payed through Credit card");
        return "Success";
    }
}
