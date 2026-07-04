package com.example.designpatterns.structural.proxy;

public class Main {

    // Used when we want to control the access of object

    public static void main(String[] args) {
        DataService dataService = new DatabaseProxy();
        dataService.fetchData("k1");
        dataService.fetchData("k1");
    }
}
