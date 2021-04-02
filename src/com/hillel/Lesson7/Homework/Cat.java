package com.hillel.Lesson7.Homework;

public class Cat {

    private String name;

    private int age;

    private String sex;




    public Cat(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;

    }

    public Cat() {

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }


    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
