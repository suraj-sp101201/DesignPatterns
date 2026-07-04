package com.example.designpatterns.creational.factory;

public class Car implements Vehicle{
    @Override
    public void deliver() {
        System.out.println("Car is used to deliver");
    }
}
