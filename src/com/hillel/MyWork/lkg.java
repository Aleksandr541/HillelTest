package com.hillel.MyWork;
import java.util.Arrays;
import java.util.Scanner;
public class lkg {
                public static void main(String[] args) {
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Введите количество ячеек в массиве");
                    int n = sc.nextInt();
                    int [] array = new int[n];
                    System.out.println("Введите первое число массива");
                    int a = sc.nextInt();
                    sc.close();
                    for (int i = 0; i < array.length; i++) {
                        array[i] = a++;
                        System.out.println("   "+array[i]);
                    }

                    String[] name = {"Sasha", "Lyosha", "Alex","Zver"};
                    int[] name2 = {10,5,17,21,15,21,4};

                    Arrays.sort(name);
                    Arrays.sort(name2);
                    System.out.println(Arrays.toString(name));
                    System.out.println(Arrays.toString(name2));

         }
    }

