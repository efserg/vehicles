package com.skillbox;

public class Car extends Vehicle implements Breakable, Refuelled {

    private static final int SPEED = 5;
    private static final double BREAKDOWN_PROBABILITY = 0.75;

    private int fuel;

    public Car(String model) {
        super(model, SPEED);
        fuel = 5;
    }

    @Override
    public void move() {
        if (this.fuel < 1) {
            refuel();
            return;
        }
        if (!isBroken()) {
            super.move();
            this.fuel -= 2;
        } else {
            System.out.println(" --> починка " + getModel());
        }
    }

    public boolean isBroken() {
        return Math.random() <= BREAKDOWN_PROBABILITY;
    }

    public void refuel() {
        System.out.println("--> дозаправка " + getModel());
        this.fuel = 5;
    }
}
