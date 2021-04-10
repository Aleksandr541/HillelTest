package com.hillel.lesson10;

public class ChildNotAbstractClass extends ParentAbstractClass {

    @Override
    public void abstractMethod() {
        System.out.println("abstract method in parent class has been implemented");
    }
}
