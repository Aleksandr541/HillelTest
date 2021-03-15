package com.hillel.lesson4.CyclecHomework;

import java.util.Scanner;

public class ScannerAge {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите свой возраст: ");
        int x = in.nextInt();
        in.close();
        if( x < 18 ){
            System.out.print("Вход строго с 18 лет");
        }else if( x < 50 ){
            System.out.print("Добро пожаловать");
        }else if( 50 < x ){
            System.out.print("Вам будет не интересно на этом сайте");
        }else{
            System.out.print("Люди столько не живут");
        }

    }

}
