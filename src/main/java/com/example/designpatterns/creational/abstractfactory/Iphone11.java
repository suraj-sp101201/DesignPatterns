package com.example.designpatterns.creational.abstractfactory;

public class Iphone11 implements Phone{
    @Override
    public void makeCall() {
        System.out.println("Calling via iphone 11");
    }
}
