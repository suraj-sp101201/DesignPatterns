package com.example.designpatterns.behavioural.observer;

public class MobileNotification implements Notification{
    @Override
    public void sendNotify() {
        System.out.println("MobileNotification");
    }
}
