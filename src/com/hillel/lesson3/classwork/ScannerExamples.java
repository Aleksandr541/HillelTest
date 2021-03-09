package com.hillel.lesson3.classwork;

import java.util.Scanner;

public class ScannerExamples {

    public static void main(String[] args) {
        String poetry = "\"Люблю тебя, Петра творенье, +\n" +
                "\"Люблю твой строгий, стройный вид,+\n" +
                "\"Невы державное теченье,+\n" +
                "\"Береговой ее гранит\");";

        // created scanner variable for text
        Scanner scannerText = new Scanner(poetry);

        String firstSentense = scannerText.nextLine();

        System.out.println(firstSentense);

        String secondSentence = scannerText.nextLine();

        System.out.println(secondSentence);

        String thirdSentence = scannerText.nextLine();

        System.out.println(thirdSentence);

        String fourthSentence = scannerText.nextLine();

        System.out.println(fourthSentence + "\n");

        // close input stream
        scannerText.close();

        // created scanner variable for keyboard input
        Scanner scannerIn = new Scanner(System.in);
        // console marker moved to next line by \n
        System.out.println("Enter your name \n");
        // reading string data by nextLine method
        String name = scannerIn.nextLine();

        System.out.println("Nice to meet you " + name);

        // console marker moved to next line by \n
        System.out.println("Enter your age \n");

        int age = scannerIn.nextInt();

        System.out.println("So nice age " + age);
        // close input stream
        scannerIn.close();
    }
}
