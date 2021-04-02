package com.hillel.Lesson8.ClassWork;

public class Incapsueltion {

    private String name;
    private int age;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.out.println("Защита возраста");
            age=0;
        }else {
        this.age = age;}
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (sex.equals("male")||sex.equals("famale")){

        }else {
            System.out.println("Защита пол");

        this.sex = "Male";}
    }

    @Override
    public String toString() {
        return "Incapsueltion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
