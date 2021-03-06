package com.hillel.lesson2.classwork;

public class BooleanOperations {
    public static void main(String[] args) {

        boolean trueValue = true;
        boolean falseValue = false;

//        if first values is false there is no need to check the second one
        boolean result = falseValue && trueValue;

//        if first values is true there is no need to check the second one
        boolean result_2 = trueValue || falseValue;

        System.out.println(result);
        System.out.println(result_2);
    }
}
