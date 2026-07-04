package com.example.designpatterns.creational.singleton;

class Main {
    public static void main(String[] args) {

        // Ensure only one instance of a class exists throughout the application.

        // Example: Cache manager, Configuration manager

        Singleton singleton = Singleton.getInstance(1);
        System.out.println(singleton.getValue());
        singleton = Singleton.getInstance(2);
        System.out.println(singleton.getValue());
    }
}


