package com.skillbox;

public class Competition {
    private final int length;

    public Competition(int length) {
        this.length = length;
    }

    public void start(Vehicle vehicle1, Vehicle vehicle2) {
        do {
            vehicle1.move();
            vehicle2.move();
            System.out.println(vehicle1);
            System.out.println(vehicle2);
        } while (!isWin(vehicle1) && !isWin(vehicle2));
        if (isWin(vehicle1)) {
            System.out.println(vehicle1.getModel() + " победил!");
        } else {
            System.out.println(vehicle2.getModel() + " победил!");
        }
    }

    private boolean isWin(Vehicle vehicle) {
        return vehicle.getX() >= this.length;
    }
}
