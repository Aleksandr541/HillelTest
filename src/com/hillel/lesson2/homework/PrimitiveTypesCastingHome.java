package com.hillel.lesson2.homework;

public class PrimitiveTypesCastingHome {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        byte byteVariable = 55;
        Byte v = 78;
        short shortVariable = 11;
        int intVariable = 534;

        float floatVariable = 7.5f;
        double doubleVariable = 25.3;
        double doubleVarieble1 = 125;

        int a = (int) floatVariable;
        int b = (int) doubleVariable;
        int c = (int) doubleVarieble1;

        System.out.println(byteVariable+shortVariable+intVariable+a+b+c);

  //TODO:  revise some knowledge and implementation in this method
//        shortVariable = byteVariable;

//        shortVariable = byteVariable;

/*
          shortVariable = byteVariable;
          intVariable = shortVariable;
          doubleVariable = floatVariable;*/

    }
}
