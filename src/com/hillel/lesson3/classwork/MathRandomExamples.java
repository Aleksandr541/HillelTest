package com.hillel.lesson3.classwork;

import java.util.Random;

public class MathRandomExamples {

    public static void main(String[] args) {

        double random = Math.random();

        System.out.println(random);

        // use seed to generate random value : same seed same random value
        Random randomVariable = new Random(2L);

        // max limit of random value
        int boundedRandomDigit = randomVariable.nextInt(10);

        System.out.println(boundedRandomDigit);

        // min/max (5/15) limit of random value
        //  create new random variable because ints method non static and cannot be called directly from class
        Random randomVaiable = new Random();
        randomVaiable.ints(5, 15)
                .findFirst()
                .getAsInt();
    }
}
