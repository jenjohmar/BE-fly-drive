package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Car car = new Car(45, 456);
        Plane plane = new Plane(600, 10000);
        FlyingCar flyingCar = new FlyingCar(300, 800);

        car.startEngine();
        car.accelerate();
        car.changeGear();
        car.brake();
        car.turnOffEngine();

        plane.startEngine();
        plane.takeOff();
        plane.changeHeight();
        plane.land();
        plane.turnOffEngine();

        flyingCar.startEngine();
        flyingCar.accelerate();
        flyingCar.changeGear();
        flyingCar.takeOff();
        flyingCar.changeHeight();
        flyingCar.land();
        flyingCar.brake();
        flyingCar.turnOffEngine();
    }
}
