package com.hillel.MyWork.Cicles;

public class ForEach {
    public static void main(String[] args) {
        String[] strings = new String[6];
        strings[0] = "Привет";
        strings[1] = "Олег";
        strings[2] = "как";
        strings[3] = "у";
        strings[4] = "тебя";
        strings[5] = "жизнь";
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();
        for (String x: strings){   //for each
            System.out.println(x);
        }

        int[] number = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        for(int x:number){
            sum = sum+x;
        }
        System.out.println();
        System.out.println(sum);
    }
}
