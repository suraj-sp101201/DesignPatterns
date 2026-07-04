package com.example.designpatterns.creational.prototype;

class Main {
    public static void main(String[] args) {

        // Create a new object by cloning an existing object instead of constructing it from scratch.

        Car car = new Car("model", 1, "brand");
        Car cloned = car.clone();
        System.out.println(cloned.equals(car));
    }
}

