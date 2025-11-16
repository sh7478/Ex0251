package com.example.ex0251.ex1;

public class Motorcycle extends Vehicle{
    @Override
    public void start() {
        System.out.println("The motorcycle engine has started");
    }

    @Override
    public void stop() {
        System.out.println("The rider used the brakes and put feet down");
    }

    @Override
    public void accelerate() {
        System.out.println("The rider accelerated with the throttle");
    }
}
