package com.hillel.lesson3.homrwork3;

import java.util.Random;

public class MathHome {

    public static void main(String[] args) {

        Random rnd = new Random();

        int number = rnd.nextInt(10);
        System.out.println("Переменная int: " + number);
        int number1 = rnd.nextInt(10);
        System.out.println("Переменная int1: " + number1);
        int number2 = rnd.nextInt(10);
        System.out.println( "Переменная int2: " + number2);

        double random = rnd.nextDouble();
        System.out.println( "Переменная double: " +random);
        double random1 = rnd.nextDouble();
        System.out.println( "Переменная double1: " +random1);
        double random2 = rnd.nextDouble();
        System.out.println( "Переменная double2: " +random2);

        double prim = random + number;
        System.out.println("Решение:" +prim);
        double prim1 = random1 + number1;
        System.out.println("Решение:" +prim1);
        double prim2 = random2 + number2;
        System.out.println("Решение:" +prim2);




    }
}
