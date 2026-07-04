package com.example.designpatterns.creational.abstractfactory;

public class MacFactory implements ElectronicFactory{

    @Override
    public Phone createDevice(String modelName) throws Exception {
        if("Iphone11".equals(modelName)) {
            return new Iphone11();
        } else if("Iphone12".equals(modelName)) {
            return new Iphone12();
        } else {
            throw new Exception("Specified model not present in apple");
        }
    }
}
