package com.example.designpatterns.creational.factory;

public class Main {
    public static void main(String args[]) throws Exception {

        // Used to Create a object based on input dynamically
        // Encapsulates object creation and creates the appropriate object based on input or conditions.

        // Example: Different payment methods, Different database implementations

        String type = "Truck";
        Vehicle vehicle;
        if(type.equals("Car")) {
            vehicle = new Car();
        } else if(type.equals("Truck")) {
            vehicle = new Truck();
        } else {
            throw new Exception("Invalid type");
        }
        vehicle.deliver();
    }
}
