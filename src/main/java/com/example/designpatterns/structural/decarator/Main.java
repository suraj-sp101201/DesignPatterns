package com.example.designpatterns.structural.decarator;

public class Main {

    // To add new behaviours on object

    public static void main(String[] args) {
        Phone phone = new SimplePhone();
        phone = new RiggedcaseDecarator(phone);
        phone = new ScreenguardDecarator(phone);
        System.out.println(phone.features().toString());
        System.out.println(phone.cost());
    }

}
