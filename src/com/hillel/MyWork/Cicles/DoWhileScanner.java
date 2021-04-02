package com.hillel.MyWork.Cicles;

import java.util.Scanner;

public class DoWhileScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value;
        do {
            System.out.println("enter 5");
            value= sc.nextInt();

        }while (value!=5);

        System.out.println("You entered 5");
    }
}
