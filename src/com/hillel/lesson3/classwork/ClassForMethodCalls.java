package com.hillel.lesson3.classwork;

public class ClassForMethodCalls {

    public static void main(String[] args) {

        // protected access method call
        int example_1 = MethodsExamples.letsGetIntegerValueMethod();

        // public access method call
        int example_2 = MethodsExamples.letsGetIntegerValueMethodWithIntIncomingParameter(15);

        // cannot be called because it is non static method
//        MethodsExamples.nonStaticPublicExample();

        // cannot be called because it is private access method
//        MethodsExamples.staticPrivateMethodExample();
    }
}
