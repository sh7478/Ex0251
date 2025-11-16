package com.example.ex0251.ex2;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("The dog eats dog's food");
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}
