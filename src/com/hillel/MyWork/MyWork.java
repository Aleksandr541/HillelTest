package com.hillel.MyWork;

import java.util.Scanner;
import java.lang.String;

public class MyWork {
    public static void main(String[] args) {
        System.out.println("Enter name:  ");
        Scanner sc = new Scanner(System.in);
        String inputWord = sc.nextLine();
        sc.close();
        String checker = "Hillel";
       boolean answer = two(checker,inputWord);
        if (answer==true){
            System.out.println( "Welcome my friend:   "+ inputWord);
        } else {
            System.out.println("hello piple");
        }
    }
    private static boolean two(String checker,String input) {
        return checker.equalsIgnoreCase(input);

    }
}
