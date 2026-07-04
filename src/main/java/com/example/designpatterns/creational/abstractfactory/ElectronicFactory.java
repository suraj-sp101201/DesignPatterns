package com.example.designpatterns.creational.abstractfactory;

public interface ElectronicFactory {
    public Phone createDevice(String modelName) throws Exception;
}
