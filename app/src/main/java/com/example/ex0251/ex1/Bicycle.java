package com.example.ex0251.ex1;

public class Bicycle extends Vehicle {
    @Override
    public void start() {
        System.out.println("The rider started pedalling");
    }

    @Override
    public void stop() {
        System.out.println("The rider pedalled the opposite way");
    }

    @Override
    public void accelerate() {
        System.out.println("The rider is pedaling faster");
    }
}
