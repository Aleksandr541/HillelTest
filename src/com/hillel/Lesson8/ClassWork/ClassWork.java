package com.hillel.Lesson8.ClassWork;

public class ClassWork {
    public static void main(String[] args) {
        Incapsueltion incapsueltion;
        incapsueltion = new Incapsueltion();

        incapsueltion.setName("lhjg");
        incapsueltion.setAge(5);
        incapsueltion.setSex("Male");

        System.out.println(incapsueltion);

        System.out.println("0000000000");

        Incapsueltion incorrect = new Incapsueltion();

        incorrect.setAge(-1);
        incorrect.setSex("unkoun");
        System.out.println(incorrect);

    }
}
