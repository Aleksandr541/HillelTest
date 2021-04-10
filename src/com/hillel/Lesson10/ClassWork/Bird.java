package com.hillel.lesson10;

public abstract class Bird extends Animal{

    public Bird(String animalType) {
        super(animalType);
    }

    public abstract void fly();
}
