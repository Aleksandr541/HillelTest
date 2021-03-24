package com.hillel.Lesson6.ClassWork;

public class Immutbl {
    public static void main(String[] args) {

        String myString = new String("My test data String");
        String mySimpleString =new String("Test");

        int myStringLength = myString.length();
        int myTestStringLength = mySimpleString.length();

        System.out.println("My string length is: "+myStringLength);
        System.out.println("My Test string length:  "+myTestStringLength);

        char[] myStringCharArray = myString.toCharArray();

        System.out.println();
    }
}
