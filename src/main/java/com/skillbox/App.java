package com.skillbox;

public class App {
    public static void main(String[] args) {
        Vehicle car = new Car("Волга");
        Vehicle bicycle = new Bicycle("Кама");
        Competition competition = new Competition(100);
        competition.start(car, bicycle);
    }
}
