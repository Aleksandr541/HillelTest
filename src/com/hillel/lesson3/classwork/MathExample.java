package com.hillel.lesson3.classwork;

public class MathExample {

    public static void main(String[] args) {

        int minDigit = Math.min(100, 45);

        int maxDigit = Math.max(4, 19);

        double squareValue = Math.sqrt(45);

        double moduleValue = Math.abs(-45);

        System.out.println("min digit value is :" + minDigit);

        System.out.println("max digit value is :" + maxDigit);

        System.out.println(maxDigit + "min digit value is :");

        System.out.println("square digit value is :" + squareValue);

        System.out.println("moduleValue digit value is :" + moduleValue);

        double randomDigit = Math.random();

        System.out.println(randomDigit);
    }
}
