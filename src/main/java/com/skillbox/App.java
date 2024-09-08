package com.skillbox;

public class App {
    public static void main(String[] args) {
        Vehicle[] vehicles = {new Car("Волга"), new Bicycle("Кама")};
        Competition competition = new Competition(100);
        final Vehicle winner = competition.race(vehicles);
        System.out.println(winner.getModel() + " победил!");
    }
}
