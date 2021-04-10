package com.hillel.lesson10;

public class ClassWork10 {

    public static void main(String[] args) {

//        ParentClass parentClass = new ParentClass("Parent");
//
//        ChildClass childClass = new ChildClass("Child");
//
//        parentClass.printSomethingToConsole();
//
//        childClass.printSomethingToConsole();
//
//        parentClass.printSomethingToConsole("test string to print for parent");
//
//        childClass.printSomethingToConsole("test string to print for child");

//        can not create object from abstract class
//        ParentAbstractClass parentAbstractClass = new ParentAbstractClass();

//        ChildNotAbstractClass childNotAbstractClass = new ChildNotAbstractClass();

        Eagle eagle = new Eagle("bird","eagle");
        Shark shark = new Shark("fish","shark");
        Elephant elephant = new Elephant("mamal","elephant");

        eagle.fly();
        shark.swim();
        elephant.run();

        eagle.attack();
//        eagle.eat();
        shark.attack();
    }
}
