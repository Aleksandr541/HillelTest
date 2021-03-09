package com.hillel.lesson3.classwork;

public class MethodsExamples {

    // static variable belongs to class, every method can use it
    static int staticVariable = 2021;

    public static void main(String[] args) {
        int newYear = staticVariable + 1;

        System.out.println(newYear);

        // overloaded method call with same name and empty incoming parameters
        int result = letsGetIntegerValueMethod();

        // overloaded method call with same name and int incoming parameter
        int resultWithSignature = letsGetIntegerValueMethodWithIntIncomingParameter(result);

        System.out.println(result);

        System.out.println(resultWithSignature);

        String friendMisha = "Misha";
        String friendIgor = "Igor";
        String friendAnna = "Anna";

        String companyName = "friends company";

        int friendsQuantity = 9;

        // overloaded method call with same name and empty incoming parameters (with ... args)
        reserveTableForFriends();

        // overloaded method call with same name and three string incoming parameters (with ... args)
        reserveTableForFriends(friendMisha, friendIgor, friendAnna);

        // overloaded method call with same name and one string and one int incoming parameters
        reserveTableForFriends(companyName, friendsQuantity);
    }

    protected static int letsGetIntegerValueMethod() {
        int digit = 10;

        return digit;
    }

    private static void reserveTableForFriends(String... names) {
        System.out.println("table for friends reserved");
    }

    private static void reserveTableForFriends(String friendsCompany, int quantity) {
        System.out.println("table for friends reserved :" + quantity);
    }

    public static int letsGetIntegerValueMethodWithIntIncomingParameter(int x) {
        int a = x + 100;
        System.out.println(a);

        letsGetIntegerValueMethod();

        return a;
    }

    // non static methods can be called only from non static methods
    // private methods can be called only within class
    private static int staticPrivateMethodExample(int year, String name) {
        System.out.println(name);

        return year + 10;
    }

    // non static methods can be called only from non static methods
    // public methods can be called everywhere in programm
    public int nonStaticPublicExample(int year, String name) {
        System.out.println(name);

        return year + 10;
    }
}
