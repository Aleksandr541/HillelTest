package com.hillel.lesson3.homrwork3;

import com.sun.deploy.cache.BaseLocalApplicationProperties;

import java.lang.management.ManagementFactory;

public class Employee {
    public static void main(String[] args) {


        String position = "position1";
        Integer age1 = 10;
        Double salary1 = new Double(0.0);

        String positionStringPooled = "position2";
        Integer age2 = 13;
        Double salary2 = new Double(0.0);

        String b = new String(position);
        boolean comparedByValues = position.equals(b);
        System.out.println(comparedByValues);
        System.out.println(age1.equals(age2));

        System.out.println(salary1.equals(salary2));
    }

}