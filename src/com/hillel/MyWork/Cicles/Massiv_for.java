package com.hillel.MyWork.Cicles;

public class Massiv_for {
    public static void main(String[] args) {
        int[] numbers = new int[70];
        for (int i = 0; i < numbers.length; i= i+5) {
            numbers[i]=i;
        }
        for (int i = 0; i < numbers.length; i=i+5) {
            System.out.println(numbers[i]);

        }

    }
}
