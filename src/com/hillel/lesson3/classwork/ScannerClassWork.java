package com.hillel.lesson3.classwork;

import java.util.Scanner;

public class ScannerClassWork {

    public static void main(String[] args) {

        Scanner scannerMyText = new Scanner(System.in);

        int enteredText = scannerMyText.nextInt();

        System.out.println(enteredText);

        scannerMyText.close();
    }

    private static String keyboardScannerInputString(){

        System.out.println("Enter your name please :");

        Scanner scannerInput = new Scanner(System.in);

        String enteredName = scannerInput.nextLine();

//        scannerInput.close();

        return enteredName + ", nice to meet you";
    }

    private static int keyboardScannerInputInteger(){

        System.out.println("Enter your age please : \n");

        Scanner scannerInput = new Scanner(System.in);

        int enteredAge = scannerInput.nextInt();

//        scannerInput.close();

        return enteredAge;
    }
}
