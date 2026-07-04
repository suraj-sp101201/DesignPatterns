package com.example.designpatterns.structural.proxy;

public class DatabaseDataService implements DataService{
    @Override
    public String fetchData(String key) {
        System.out.println("Fetching from database");
        return "";
    }
}
