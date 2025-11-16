package com.example.ex0251.ex2;

public class Bird extends Animal{
    @Override
    public void eat() {
        System.out.println("The bird eats seeds");
    }

    @Override
    public void makeSound() {
        System.out.println("The birds tweet");
    }
}
