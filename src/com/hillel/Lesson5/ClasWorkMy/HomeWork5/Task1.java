package com.hillel.Lesson5.ClasWorkMy.HomeWork5;
import java.lang.management.ManagementFactory;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Entered Name");
        String enterName = sc.nextLine();

        if (enterName.equals("Hillel")){
            System.out.println("Welcome to curses  " +enterName);
        }else{
            System.out.println("Welcome  ");
        }

    }

}
