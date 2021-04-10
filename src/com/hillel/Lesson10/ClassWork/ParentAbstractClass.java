package com.hillel.lesson10;

public abstract class ParentAbstractClass {

    private String value;

    public abstract void abstractMethod();

    public void notAbstractMethod(){
        System.out.println("i am not abstract");
    }
}
