package com.hillel.lesson3.homrwork3;

import java.util.Random;
import java.util.Scanner;

public class lotereya {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество игроков:");
        int n = in.nextInt();
        System.out.print("Победил игрок №:");


        Math.random();
        int min = 1;
        int max = n;
        int diff = max - min;
        java.util.Random Random = new Random();
        int i = Random.nextInt(diff + 1);
        i += min;
        System.out.print(i);


    }
}
