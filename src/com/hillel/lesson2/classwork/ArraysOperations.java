package com.hillel.lesson2.classwork;

import java.util.Arrays;

public class ArraysOperations {

    public static void main(String[] args) {

// just to initialize empty array with default values
        int[] myArray = new int[10];

        int[] myArrayFilled = {12, 232, 456, 1, 54, 32, 98, 112};

        String[] names = {"Nikolay", "Alena", "Dima", "Sasha"};

        String myName = names[2];

        System.out.println(myName);

        System.out.println(names);

        System.out.println(java.util.Arrays.toString(names));

        java.util.Arrays.sort(myArrayFilled);
        java.util.Arrays.sort(names);

        System.out.println(java.util.Arrays.toString(myArrayFilled));
        System.out.println(java.util.Arrays.toString(names));

// length = capacity of array (not capacity of filled data)
        System.out.println(names.length);

        System.out.println(Arrays.binarySearch(myArrayFilled, 232));
        System.out.println(Arrays.binarySearch(myArrayFilled, 200));

// to be discussed
        Arrays.sort(myArrayFilled);

        System.out.println(Arrays.binarySearch(myArrayFilled, 232));
        System.out.println(Arrays.binarySearch(myArrayFilled, 200));

        int[] myArrayFilledSorted = {1, 12, 54, 32, 98, 112, 232,456};

        System.out.println(Arrays.binarySearch(myArrayFilledSorted, 232));
        System.out.println(Arrays.binarySearch(myArrayFilledSorted, 200));



// matrix arrays
        int[][] myMatrixArray = new int[3][3];

        int[][] myMatrixArrayFilled = {{1, 2}, {1, 3}};

        System.out.println(myMatrixArray);
        System.out.println(myMatrixArrayFilled);

        System.out.println(java.util.Arrays.toString(myMatrixArrayFilled));

        System.out.println(java.util.Arrays.deepToString(myMatrixArray));
        System.out.println(java.util.Arrays.deepToString(myMatrixArrayFilled));
    }
}
