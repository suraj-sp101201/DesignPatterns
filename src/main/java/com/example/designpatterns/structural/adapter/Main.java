package com.example.designpatterns.structural.adapter;

public class Main {

    // Adapter design pattern is used when two interfaces are incompatible and we have to
    // change/modify to make it suitable for other interface

    public static void main(String[] args) {
        Payment payment = new RazorpayPaymentAdapter();
        payment.pay(100D);
    }
}
