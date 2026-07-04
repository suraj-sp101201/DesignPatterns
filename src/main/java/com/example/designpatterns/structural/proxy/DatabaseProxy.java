package com.example.designpatterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class DatabaseProxy implements DataService{

    private DataService dataService;

    private Map<String, String> cache;

    DatabaseProxy () {
        dataService = new DatabaseDataService();
        cache = new HashMap<>();
    }

    @Override
    public String fetchData(String key) {
        if(cache.containsKey(key)) {
            System.out.println("Getting from cache");
            return cache.get(key);
        }
        String data = dataService.fetchData(key);
        cache.put(key, data);
        return data;
    }
}
