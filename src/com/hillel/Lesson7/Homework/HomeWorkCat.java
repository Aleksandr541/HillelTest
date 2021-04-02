package com.hillel.Lesson7.Homework;

public class HomeWorkCat {


    public static void main(String[] args) {
        System.out.println("Cat");

        Cat dexter = new Cat("Dexter",5,"male");
        Cat kuzya = new Cat("Kuzya",7,"male");
        Cat myrka = new Cat("Myrka",2,"female");

        System.out.println(dexter);
        System.out.println(kuzya);
        System.out.println(myrka);

        System.out.println("Dogs");

        Dog sharik = new Dog("Sharik","shepherd",50);
        Dog dana = new Dog("Dana","rottweiler",50);
        Dog lana = new Dog("Lana","bulldog",0);

        System.out.println(sharik);
        System.out.println(dana);
        System.out.println(lana);



//        Cat cat = new Cat();
//        cat.name = "Felix";
//        cat.age = 10;
//        cat.sex = "male";
//        System.out.println(cat.name);
//        cat.setName("Felix");
//        System.out.print("Name: "+cat.getName());
//        System.out.print(" Age: "+cat.getAge());
//        System.out.print(" Sex:  "+cat.getSex());

    }
}
