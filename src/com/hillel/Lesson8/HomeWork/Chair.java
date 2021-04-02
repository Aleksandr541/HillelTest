package com.hillel.Lesson8.HomeWork;

public class Chair {
    private String name;
    private int height;
    private int width;

    public Chair(){
    }

    public Chair(String name) {
        this.name = name;
    }

    public Chair(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Chair(String name, int height, int width) {
        this.name = name;
        this.height = height;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
