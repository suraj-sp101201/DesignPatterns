package com.example.designpatterns.behavioural.observer;

public class Main {

    // To be used when a change of one object triggers changes in many other objects
    public static void main(String[] args) {
        Notification mobileNotification = new MobileNotification();
        Notification mailNotification = new EmailNotification();
        YoutubeChannel youtubeChannel = new YoutubeChannel();
        youtubeChannel.addNotification(mailNotification);
        youtubeChannel.addNotification(mobileNotification);
        youtubeChannel.sendNotify();
    }

}
