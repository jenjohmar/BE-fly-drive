package com.company;

public class Car extends Vehicle implements Driveable {

    public Car(int speed, float weight) {
        super(speed, weight);
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerating! Current speed is: " + getSpeed());
    }
    @Override
    public void brake() {
        System.out.println("Car weighing " + getWeight() + " is braking!");
    }
    @Override
    public void changeGear() {
        System.out.println("Car changing gear!");
    }
}
