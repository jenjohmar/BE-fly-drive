package com.company;

public class Plane extends Vehicle implements Flyable {

    public Plane(int speed, float weight) {
        super(speed, weight);
    }

    @Override
    public void takeOff() {
        System.out.println("Plane taking off! Current speed is: " + getSpeed());
    }

    @Override
    public void land() {
        System.out.println("Plane weighing " + getWeight() + " kilograms is landing!");
    }

    @Override
    public void changeHeight() {
        System.out.println("Plane changing height!");
    }
}
