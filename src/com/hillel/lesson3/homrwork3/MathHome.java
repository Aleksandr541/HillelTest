package com.hillel.lesson3.homrwork3;

import java.util.Random;

public class MathHome {

    public static void main(String[] args) {

        Random randomVariable = new Random(2L);
        int boundedRandomDigit = randomVariable.nextInt(10);
        int b = 32;
        int c = 60;

        double x = 11;
        double y = 7.6;
        double z = 25.125;

        System.out.println(boundedRandomDigit);
        Random randomVaiable = new Random();
        randomVaiable.ints(5, 15)
                .findFirst()
                .getAsInt();

    }
}
