package com.hillel.lesson3.homrwork3;

import java.util.Scanner;

public class HomeworkScanner {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Введите Ваше имя:");
        String FirstName = s.nextLine();

        System.out.println("Введите Вашу фамилию:");
        String LastName = s.nextLine();

        System.out.print("Укажите сколько Вам полных лет:");
        int age = s.nextInt();
        s.nextLine();

//        System.out.println("Укажите сколько Вам полных лет:");
//        Integer.age(s.nextLine());

        System.out.println("Введите Вашу почту для регистрации:");
        String email = s.nextLine();

        System.out.println("Напишите несколько слов о себе:");
        String intrview = s.nextLine();

        System.out.println("Введите Ваше имя:" + FirstName);
        System.out.println("Введите Вашу фамилию:" + LastName);
        System.out.println("Укажите сколько Вам полных лет:" + age);
        System.out.println("Введите Вашу почту для регистрации:" + email);
        System.out.println("Напишите несколько слов о себе:"+intrview);

        s.close();

    }
}
