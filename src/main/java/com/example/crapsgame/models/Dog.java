package com.example.crapsgame.models;

public class Dog implements AnimalInterface {

    @Override
    public void makeSound() {
        System.out.println("Guau Guau");
    }
}
