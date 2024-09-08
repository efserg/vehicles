package com.skillbox;

public class Bicycle extends Vehicle implements Breakable {

    private static final int SPEED = 2;
    private static final double BREAKDOWN_PROBABILITY = 0.35;

    public Bicycle(String model) {
        super(model, SPEED);
    }

    @Override
    public void move() {
        if (!isBroken()) {
            super.move();
        } else {
            System.out.println(" --> починка " + getModel());
        }
    }

    public boolean isBroken() {
        return Math.random() <= BREAKDOWN_PROBABILITY;
    }
}
