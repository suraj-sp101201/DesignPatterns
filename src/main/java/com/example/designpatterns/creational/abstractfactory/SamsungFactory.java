package com.example.designpatterns.creational.abstractfactory;

public class SamsungFactory implements ElectronicFactory{
    @Override
    public Phone createDevice(String modelName) throws Exception {
        if("S21".equals(modelName)) {
            return new S21();
        } else if("S22".equals(modelName)) {
            return new S22();
        } else {
            throw new Exception("Specified model not present in samsung");
        }
    }
}
