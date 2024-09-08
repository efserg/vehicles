package com.skillbox;

public abstract class Vehicle {
    private int x;
    private final String model;
    private final int speed;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
        this.x = 0;
    }

    public void move() {
        this.x += speed;
    }

    public int getX() {
        return x;
    }

    @Override
    public String toString() {
        return "Модель '" + model + "' движется в точке " + x;
    }

    public String getModel() {
        return model;
    }
}
