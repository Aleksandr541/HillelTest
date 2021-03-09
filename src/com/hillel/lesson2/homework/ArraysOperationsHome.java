package com.hillel.lesson2.homework;

import java.util.Arrays;

public class ArraysOperationsHome {
    public static void main(String[] args) {


        int[] myArray = new int[5];
        int[] myArrayFilled = {1, 2, 3, 4, 5};

        int myArrayFilled1 = myArrayFilled[0]%2;
        int myArrayFilled2 = myArrayFilled[1]%2;
        int myArrayFilled3 = myArrayFilled[2]%2;
        int myArrayFilled4 = myArrayFilled[3]%2;
        int myArrayFilled5 = myArrayFilled[4]%2;


        Arrays.sort(myArrayFilled);
        System.out.println(Arrays.toString(myArrayFilled));

        System.out.print(myArrayFilled1 );
        System.out.print(myArrayFilled2 );
        System.out.print(myArrayFilled3 );
        System.out.print(myArrayFilled4 );
        System.out.println(myArrayFilled5 );

        System.out.print(myArrayFilled[0]+2 );
        System.out.print(myArrayFilled[1]-2 );
        System.out.print(myArrayFilled[2]+2 );
        System.out.print(myArrayFilled[3]-2 );
        System.out.print(myArrayFilled[4]+2 );

/*
        if (myArrayFilled[1] == 1){
            System.out.print(myArrayFilled[1] + 2);
        }
        else {System.out.print(myArrayFilled[1] - 2);}
        if (myArrayFilled2 == 0){
            System.out.print(myArrayFilled2+2);
        }
        else {System.out.print(myArrayFilled2-2);}
        if (myArrayFilled3 == 1){
            System.out.print(myArrayFilled3+2);
        }
        else {System.out.print(myArrayFilled3-2);}
        if (myArrayFilled4 == 0){
            System.out.print(myArrayFilled4+2);
        }
        else {System.out.print(myArrayFilled4-2);}
        if (myArrayFilled5 == 1){
            System.out.print(myArrayFilled5+2);
        }
        else {System.out.print(myArrayFilled5-2);}*/


    }
}