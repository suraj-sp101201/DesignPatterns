package com.example.designpatterns.creational.abstractfactory;

public class Iphone12 implements Phone{
    @Override
    public void makeCall() {
        System.out.println("Calling via iphone 12");
    }
}
