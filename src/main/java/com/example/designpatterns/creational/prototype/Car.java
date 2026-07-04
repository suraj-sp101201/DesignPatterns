package com.example.designpatterns.creational.prototype;

public class Car implements Cloneable{
    private String modelName;
    private int year;

    private String brand;

    public Car(String modelName, int year, String brand) {
        this.year = year;
        this.modelName = modelName;
        this.brand = brand;
    }

    public Car(Car car) {
        this.brand = car.brand;
        this.modelName = car.modelName;
        this.year = car.year;
    }

    @Override
    public Car clone() {
        return new Car(this);
    }

    @Override
    public boolean equals(Object object) {
        if(this==object) {
            return true;
        } else if(object!=null && object.getClass()==getClass()) {
            Car car = (Car) object;
            return ((car.brand.equals(this.brand))&&(car.year==this.year)&&(car.modelName.equals(this.modelName)));
        }
        return false;
    }
}
