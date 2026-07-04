package com.example.designpatterns.structural.decarator;

import java.util.List;

public class RiggedcaseDecarator extends PhoneDecarator{

    public RiggedcaseDecarator(Phone phone) {
        super(phone);
    }

    @Override
    public List<String> features() {
        List<String> list = phone.features();
        list.add("Riggedcase");
        return list;
    }

    @Override
    public double cost() {
        return phone.cost()+5;
    }
}
