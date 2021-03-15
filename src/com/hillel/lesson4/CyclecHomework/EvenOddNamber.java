package com.hillel.lesson4.CyclecHomework;

public class EvenOddNamber {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            int odd = i%2;
            if(odd==1) {
        System.out.println( +i+ "  This is odd namber");
            } else if(odd==0){
            System.out.println( +i+ "  This is even namber");
            }
            }
        }
    }
