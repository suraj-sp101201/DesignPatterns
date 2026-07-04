package com.example.designpatterns.structural.facade;

public class RestaurantFacade {
    private final Waiter waiter;
    private final Cook cook;

    public RestaurantFacade() {
        this.waiter = new Waiter();
        this.cook = new Cook();
    }

    // Single unified method that handles the workflow
    public void orderMeal(String dish) {
        System.out.println("--- Customer places order ---");

        waiter.takeOrder(dish);
        cook.prepare(dish);
        waiter.serveFood();

        System.out.println("--- Workflow Finished ---\n");
    }
}
