package com.hillel.Lesson5.ClasWorkMy.HomeWork5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое 3-х значное число:  ");

        int x = sc.nextInt();
        int a = x/100;
        int v = x/10;
        int b = v%10;
        int c = x%10;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
