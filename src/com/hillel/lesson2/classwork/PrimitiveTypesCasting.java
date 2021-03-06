package com.hillel.lesson2.classwork;

public class PrimitiveTypesCasting {
    public static void main(String[] args) {

        byte byteVariable = 10;
        short shortVariable = 100;
        int intVariable = 1000;
        long longVariable = 100000;

        float floatVariable = 10.5f;

        double doubleVariable = 15.5;

        System.out.println(byteVariable + shortVariable);
        System.out.println(intVariable + longVariable);

        shortVariable = byteVariable;

        byteVariable = (byte) shortVariable;

        doubleVariable = floatVariable;

        floatVariable = (float) doubleVariable;


        intVariable = (int) floatVariable;

        System.out.println(intVariable);
    }
}
