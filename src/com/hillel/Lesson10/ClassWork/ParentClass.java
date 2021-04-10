package com.hillel.lesson10;

public class ParentClass {

    private String parentName;

    public ParentClass(String parentName) {
        this.parentName = parentName;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public void printSomethingToConsole(){
        System.out.println("this is parent class");
    }

    public void printSomethingToConsole(String textToPrint){
        System.out.println(textToPrint);
    }

    @Override
    public String toString() {
        return "ParentClass{" +
                "parentName='" + parentName + '\'' +
                '}';
    }
}
