package com.example.designpatterns.behavioural.template;

abstract class PlantTree {
    public final void plant() {
        digGround();
        pourWater();
        addFertilisers();
    }

    private void digGround() {
        System.out.println("Digging ground");
    }

    private void pourWater() {
        System.out.println("pour water");
    }

    protected abstract void addFertilisers();
}
