package com.example.designpatterns.behavioural.strategy;

public class Main {

    // Strategy is used when you want to change behaviour in runtime. UPI and Creditcard is
    // interchangeable. Objects created inside Factory need not have common interface. But in
    // strategy it has to be. Strategy and Factory are very tightly coupled.

    public static void main(String[] args) {
        PaymentStrategy paymentStrategy = new UpiPaymentStrategy();
        PaymentService paymentService = new PaymentService(paymentStrategy);
        paymentService.pay(100D);
    }
}
