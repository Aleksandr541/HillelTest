package com.hillel.lesson3.homrwork3;

import java.util.Random;
import java.util.Scanner;

public class lotereya {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        Scanner in = new Scanner(System.in);


        System.out.print("Введите количество игроков: ");
        int n = in.nextInt();
        System.out.printf("Поздравляю победил игрок №:");


//       in.close();

        Math.random();
        int min = 1;
        int max = n;
        int diff = max - min;
        java.util.Random Random = new Random();
        int i = Random.nextInt(diff + 1);
        i += min;
        System.out.println(i);


    }
}
