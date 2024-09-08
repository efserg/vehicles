package com.skillbox;

public class Competition {
    private final int length;

    public Competition(int length) {
        this.length = length;
    }

    public Vehicle race(Vehicle[] vehicles) {
        while (true) {
            for (Vehicle vehicle : vehicles) {
                vehicle.move();
                if (vehicle.getX() >= this.length) {
                    return vehicle;
                }
            }
        }
    }
}