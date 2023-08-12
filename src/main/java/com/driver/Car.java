package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.type = type;
        this.seats = seats;
        this.currentGear = 1; // Initialize default gear
    }

    public void changeGear(int newGear) {
        if (newGear >= 1 && newGear <= gears) {
            this.currentGear = newGear;
            System.out.println("ChangeGear method called - The gear is changed to: " + currentGear);
        } else {
            System.out.println("Invalid gear. Gear remains unchanged.");
        }
    }

    public void changeSpeed(int newSpeed, int newDirection) {
        move(newSpeed, newDirection);
        System.out.println("ChangeSpeed method called - The speed is changed to: " + newSpeed + " km/h, and the direction is changed to: " + newDirection + " degrees");
    }
}
