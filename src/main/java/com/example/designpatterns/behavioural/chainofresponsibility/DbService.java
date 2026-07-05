package com.example.designpatterns.behavioural.chainofresponsibility;

public class DbService extends Process{
    @Override
    public void handle() {
        System.out.println("Making DB Call");
        if(next!=null) {
            next.handle();
        }
    }
}
