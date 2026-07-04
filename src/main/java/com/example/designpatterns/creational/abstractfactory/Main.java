package com.example.designpatterns.creational.abstractfactory;

public class Main {
    public static void main(String args[]) throws Exception {

        // Used to create objects through different factories.

        // Example: PhoneFactory. SamsungPhoneFactory and ApplePhoneFactory implements and
        // related objects will be inside that factory and based on input the object is created.

        ElectronicFactory electronicFactory;
        String brand = "Apple";
        if("Apple".equals(brand)) {
            electronicFactory = new MacFactory();
        } else if("Samsung".equals(brand)) {
            electronicFactory = new SamsungFactory();
        } else {
            throw new Exception("Invalid Brand");
        }
        String modelName = "Iphone12";
        Phone phone = electronicFactory.createDevice(modelName);
        phone.makeCall();
    }
}
