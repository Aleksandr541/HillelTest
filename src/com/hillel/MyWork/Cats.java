package com.hillel.MyWork;

public class Cats {
    public static void main(String[] args) {

        String[] cats = {"Kotik", "Dexter" ,"Barsik","Kisa","Boxer"};
        int catsLang = cats.length;

        for (int a = 0; a < catsLang; a++) {
            String catMame = cats[a];

            if ((!catMame.startsWith("K") && !catMame.startsWith("B"))){
                System.out.println("My life cat Dexter:  "+catMame);
                break;
            }else if (catMame.startsWith("K")) {
                System.out.println("Cat sex is mata and name:  " + catMame);
            } else if(catMame.startsWith("B")){
                System.out.println("Result cats on letter B:  " + catMame);
            }

        }
    }
}
