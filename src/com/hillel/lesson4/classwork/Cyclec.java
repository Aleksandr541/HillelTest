package com.hillel.lesson4.classwork;

public class Cyclec {
    public static void main(String[] args) {

/*

          int a = 100;

          int b = 500;
//simple cyclewith operator

        while(a<b){
        System.out.println("Cycle operation starting:");
        a = a+100;
        System.out.println("a value:" +a);
        }

        String myName = "Dima";
        String friendName_Dima = "Dima";
        String friendName = "Igor";

        while (myName.equals(friendName));        {
            friendName_Dima = friendName;
            System.out.println("friendName_Dima value" + friendName_Dima);
        }
        int x = 1;
        int y = 50

                do {
                    System.out.println("x value is:" +x);
                    System.out.println("x value is:" +y);
                    System.out.println("first cycle starting");
                }  y= y -5;
                wile (x < y);
//

//            System.out.println("first cycle ending");
        }
*//*
        int z = 25;
        int x = 1;

        for( x = 1; x < z; x++){

            System.out.println("starting");
        }
        int [] myDigit = {1,2,3,4,5,6,7,8,9,10};

        for(int xx = 1; x<z; X++){

        }
        */

        String [] cats = {"Murzik", "Barsik","Kotik", "Bizik","Dexter" };

        int catsLength = cats.length;
        for (int a = 0; a < catsLength; a++){
            String catName = cats[a];
            if (catName.startsWith("K") & catName.startsWith("B")){
                System.out.println("Thats Dexter cat!!!: " +catName);
            }
            if (catName.startsWith("K")){
                System.out.println("Cat sex is male and nameK: " +catName);
                break;
            } else {
                System.out.println("Cat sex is male and nameK: " +catName);
            } if (catName.startsWith("B")){

            }else {
                System.out.println("Thats Dexter cat!!!: " +catName);

            }
        }

    }


}

