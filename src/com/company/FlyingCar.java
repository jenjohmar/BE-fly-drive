package com.company;

public class FlyingCar extends Vehicle implements Driveable, Flyable{
    public FlyingCar(int speed, float weight) {
        super(speed, weight);
    }

    @Override
    public void accelerate() {
        System.out.println("Flying car accelerating! Current speed is: " + getSpeed());
    }
    @Override
    public void brake() {
        System.out.println("Flying car braking!");
    }
    @Override
    public void changeGear() {
        System.out.println("Flying car changing gear!");
    }

    @Override
    public void takeOff() {
        System.out.println("Flying car taking off!");
    }

    @Override
    public void land() {
        System.out.println("Flying car landing!");
    }

    @Override
    public void changeHeight() {
        System.out.println("Flying car changing height!");
    }

}
