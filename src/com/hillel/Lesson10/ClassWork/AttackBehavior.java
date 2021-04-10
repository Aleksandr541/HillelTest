package com.hillel.lesson10;

public interface AttackBehavior {

    String test = "ddd";

//    void attack(Animal animal);

    default void attack(){
        System.out.println("default attack");
    }
}
