package com.example.designpatterns.behavioural.observer;

public class EmailNotification implements Notification{
    @Override
    public void sendNotify() {
        System.out.println("EmailNotification");
    }
}
