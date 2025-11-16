package com.example.ex0251.ex2;

public class Cat extends Animal{
    @Override
    public void eat() {
        System.out.println("The cat eats cat's food");
    }

    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}
