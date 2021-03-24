package com.hillel.MyWork;

import java.io.File;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:  ");
        double a = sc.nextInt();
        System.out.println("Enter two number:   ");
        double b = sc.nextInt();
        System.out.println("Enter operation:   ");
        char o = sc.next().charAt(0);
        sc.close();


        double ans;
        switch(o) {
            case '+': ans = a + b;
                break;
            case '-': ans = a - b;
                break;
            case '*': ans = a * b;
                break;
            case '/': ans = a / b;
                break;
            default:  System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.println(ans);
    }
}
