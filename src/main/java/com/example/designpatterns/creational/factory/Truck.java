package com.example.designpatterns.creational.factory;

public class Truck implements Vehicle{
    @Override
    public void deliver() {
        System.out.println("Truck is used to deliver");
    }
}
