package com.hillel.MyWork;

public class Works {
    public static void main(String[] args) {
        int a = 5;
        int b =200;

        int c = (a<b)? 15:30;
        System.out.println(c);

        int month = 4;

        switch (month){
            case 1:
                System.out.println("This is month January ");
                break;
            case 2:
                System.out.println("This is month February");
                break;
            case 3:
                System.out.println("This is month Mart");
                break;
            case 4:
                System.out.println("This is month April");
                break;
        }
    }
}
