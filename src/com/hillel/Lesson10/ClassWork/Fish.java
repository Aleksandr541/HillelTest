package com.hillel.lesson10;

public abstract class Fish extends Animal{

    public Fish(String animalType) {
        super(animalType);
    }

    public abstract void swim();
}
