package com.example.designpatterns.structural.adapter;

public class PayUPaymentAdapter implements Payment{

    private PayUPayment payUPayment;
    @Override
    public String pay(Double amount) {
        return payUPayment.doPayment(amount);
    }
}
