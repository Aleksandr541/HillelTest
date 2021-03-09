package com.hillel.lesson3.classwork;

public class EqualsExamples {

    public static void main(String[] args) {

        String a = "a";

        String aStringPooled = "a";

        String b = new String("a");

        // comparing not values but links
        boolean comparedByLinks = a == b;

        // comparing not values but links (string pooled)
        boolean comparedByLinksStringPool = a == aStringPooled;

        // comparing values
        boolean comparedByValues = a.equals(b);

        System.out.println(comparedByLinks);
        System.out.println(comparedByLinksStringPool);
        System.out.println(comparedByValues);
    }
}
