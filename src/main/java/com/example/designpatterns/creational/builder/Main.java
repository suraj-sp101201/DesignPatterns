package com.example.designpatterns.creational.builder;

class Main {
    public static void main(String[] args) {

        // Construct a complex object step by step, especially when it has many optional parameters.

        // If you dont use, then you have to create a additional parameter for constructor and
        // pass null.

        // A Builder is preferred over setters because it creates immutable objects,
        // improves readability with named methods, avoids telescoping constructors
        // when there are many optional fields, and allows validation before the object is created.
        // Setters leave objects mutable and can result in partially initialized or invalid objects.

        // The User object was created before it was fully initialized.
        // Another thread or another method could use it in an invalid state.

        Computer computer = new Computer.ComputerBuilder().setCompanyName("c1").setModelName("m1").setNoOfCores(4).build();
        System.out.println(computer);
    }
}

