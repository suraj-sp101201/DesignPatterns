package com.example.designpatterns.structural.adapter;

public class RazorpayPaymentAdapter implements Payment{

    private RazorpayPayment razorpayPayment;

    @Override
    public String pay(Double amount) {
        return razorpayPayment.makePayment(amount);
    }
}
