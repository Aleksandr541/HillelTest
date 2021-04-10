package com.hillel.lesson10;

public abstract class Animal {

    private String animalType;

    public Animal(String animalType) {

        this.animalType = animalType;
    }

    public abstract void move();

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}
