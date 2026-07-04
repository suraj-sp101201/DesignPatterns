package com.example.designpatterns.structural.facade;

public class Main {

    // To external, only an interface is exposed. Facade must figure out
    // how to finish the task

    public static void main(String[] args) {
        RestaurantFacade restaurantFacade = new RestaurantFacade();
        restaurantFacade.orderMeal("dish1");
    }
}
