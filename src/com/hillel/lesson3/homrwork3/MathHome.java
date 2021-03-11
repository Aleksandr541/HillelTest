package com.hillel.lesson3.homrwork3;

import java.util.Random;

public class MathHome {

    public static void main(String[] args) {

        int a = 1;
        int b = 32;
        int c = 60;

        double x = 11;
        double y = 7.6;
        double z = 25.125;

        double prim1 = a + x;
        double prim2 = b + y;
        double prim3 = c + z;

        double random1 = Math.random(prim1);
        double random2 = Math.random(prim2);
        double random3 = Math.random(prim3);

        for (int i = 0; i < 3; i++)
            System.out.println(Math.random());

//        String [] myString = new String[]{"random1", "random2", "random3"};
//        double n = (double)Math.floor(Math.random()* myString.lengh);
//        System.out.println(myString[n]);


    }
}
