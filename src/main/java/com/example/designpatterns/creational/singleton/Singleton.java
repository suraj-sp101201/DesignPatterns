package com.example.designpatterns.creational.singleton;

public class Singleton {

    private static volatile Singleton singleton;

    private int value;

    public int getValue() {
        return value;
    }

    private Singleton(int value) {
        this.value =  value;
    }

    public static Singleton getInstance(int value) {
        Singleton test = singleton;
        if(test!=null) {
            return test;
        }
        synchronized(Singleton.class) {
            if(test==null) {
                singleton = new Singleton(value);
            }
            return singleton;
        }
    }
}
