package com.hillel.Lesson8.HomeWork;

public class Bed {
    private String name;
    private int height;
    private int width;

    public Bed(){
    }

    public Bed(String name) {
        this.name = name;
    }

    public Bed(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Bed(String name, int height, int width) {
        this.name = name;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
