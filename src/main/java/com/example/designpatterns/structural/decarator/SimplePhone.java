package com.example.designpatterns.structural.decarator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimplePhone implements Phone{

    @Override
    public List<String> features() {
        return new ArrayList<>(Arrays.asList("Phone"));
    }

    @Override
    public double cost() {
        return 100;
    }
}
