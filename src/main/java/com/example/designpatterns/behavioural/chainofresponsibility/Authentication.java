package com.example.designpatterns.behavioural.chainofresponsibility;

public class Authentication extends Process{

    @Override
    public void handle() {
        System.out.println("Performing authentication");
        if(next!=null) {
            next.handle();
        }
    }
}
