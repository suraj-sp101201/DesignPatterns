package com.example.designpatterns.behavioural.chainofresponsibility;

public class Main {

    // Used when you want to execute a sequence of process

    public static void main(String[] args) {
        Process process = new Authentication();
        process.setNext(new DbService());
        process.handle();
    }
}
