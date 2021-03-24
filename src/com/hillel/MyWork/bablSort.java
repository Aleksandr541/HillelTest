package com.hillel.MyWork;

import java.util.Arrays;
import java.util.Scanner;

public class bablSort {
    public static void main(String[] args) {
        int[] array = new int[] {1,5,9,4,1,5,64,684,48,8,98,48,98,48,89,48,65,13,21,68,44};

        boolean iaSorted = false;
        while (!iaSorted) {
            iaSorted = true;

            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    iaSorted = false;
                }

                System.out.println(Arrays.toString(array));
            }

        }

    }

}
