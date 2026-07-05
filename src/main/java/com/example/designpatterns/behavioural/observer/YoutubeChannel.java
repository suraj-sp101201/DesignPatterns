package com.example.designpatterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {
    List<Notification> notificationList = new ArrayList<>();

    public void addNotification(Notification notification) {
        notificationList.add(notification);
    }

    public void removeNotification(Notification notification) {
        notificationList.remove(notification);
    }

    public void sendNotify() {
        for(Notification notification: notificationList) {
            notification.sendNotify();
        }
    }
}
