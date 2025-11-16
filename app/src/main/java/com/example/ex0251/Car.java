package com.example.ex0251;

public class Car extends Vehicle{

    @Override
    public void start() {
        System.out.println("The car engin has started");
    }

    @Override
    public void stop() {
        System.out.println("the brake pedal has been pressed");
    }

    @Override
    public void accelerate() {
        System.out.println("The gas pedal had been pressed");
    }
}
