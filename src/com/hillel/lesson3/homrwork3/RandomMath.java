package com.hillel.lesson3.homrwork3;

import java.util.Random;

public class RandomMath {
    public static void main(String[] args) {

        int min = 1541;
        int max = 2435;
        int n = max - min;
        Random Random = new Random();
        int random_number = Random.nextInt(n + 1);
        random_number += min;
        System.out.println("Зарплата :" + random_number);


        int a = 1500;
        int b = 4000;

        int random_number1 = a + (int) (Math.random() * b);
        System.out.println("Зарплата1 : " + random_number1);

    }
}
