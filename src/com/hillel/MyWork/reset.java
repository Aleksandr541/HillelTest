package com.hillel.MyWork;

public class reset {
    public static void main(String[] args) {
        int a = 100;
        int b = 500;

        while (a<b){
            System.out.println("Cicle operation start:  ");
            a= a+100;
            System.out.println("it value:  " + a);
        }

        String myName = "Dima";
        String friendName_Dima = "Dima";
        String friendName = "Igor";

        while (myName.equals(friendName_Dima)){
            friendName_Dima=friendName;
            System.out.println("frienDima Value: " + friendName_Dima);
        }
        int x = 50;
        int y = 400;

        do {
            System.out.println("Process starting:  ");
            y = y-x;
            System.out.println("Process end:  "+y);

        }while (x<y);


        int firstName = 5;
        int secondName = 25;
        while (firstName==secondName){
            System.out.println("Never will be performed");
        }
        do {
            System.out.println("Performed");
        }while (firstName==secondName);

    }
}
