package com.example.designpatterns.structural.decarator;

import java.util.List;

public class ScreenguardDecarator extends PhoneDecarator{

    public ScreenguardDecarator (Phone phone) {
        super(phone);
    }
    @Override
    public List<String> features() {
        List<String> list = phone.features();
        list.add("Screenguard");
        return list;
    }

    @Override
    public double cost() {
        return phone.cost()+10;
    }
}
