package com.hillel.lesson4.CyclecHomework;

public class IfileOpereshionHome {
    public static void main(String[] args) {
// Наименьшее число в массиве

        int [] numbers = new int[10];
        for (int i=0; i< numbers.length;i++){
            numbers[i]= i+1;
        }
        int min = numbers[0];
        for (int i=1; i< numbers.length;i++){
            min = Math.min(min, numbers[i]);
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Минимальное значение в массиве numbers: " + min);



// Наибольшее значение в массиве

        int [] numbers1 = new int[10];
        for (int i=0; i< numbers1.length;i++){
            numbers1[i]= i+1;
        }
        int max = numbers1[0];
        for (int i=0; i< numbers1.length;i++){
            max = Math.max(max, numbers1[i]);
            if (numbers1[i] < max) {
                max = numbers1[i];
            }
        }
        System.out.println("Максимальное значение в массиве numbers1: " + max);


    }
}
