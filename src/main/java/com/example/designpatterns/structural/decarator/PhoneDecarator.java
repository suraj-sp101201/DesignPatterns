package com.example.designpatterns.structural.decarator;

abstract class PhoneDecarator implements Phone {
    protected Phone phone;

    public PhoneDecarator(Phone phone) {
        this.phone = phone;
    }
}
