package com.example.designpatterns.structural.facade;

public class Waiter {
    public void takeOrder(String dish) {
        System.out.println("[Waiter] Writing down order for: " + dish);
    }
    public void serveFood() {
        System.out.println("[Waiter] Carrying the plate to the table. Enjoy your meal!");
    }
}
