package com.hillel.lesson4.CyclecHomework;

public class CyclessHomework {

    public static void main(String[] args) {


        int a = 1;
        while (a <= 10) {
            System.out.println(+a);
            a = a + 1;
        }
        for (int b = 1; b <= 10; b++) {
            System.out.println(b);
        }
        int c = 100;
        while (c >= 0) {
            System.out.println(c);
            c = c - 10;
        }
        for (int d = 100; d >= 0; d -= 10) {
            System.out.println(d);
        }


    }

}