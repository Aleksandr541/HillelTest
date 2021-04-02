package com.hillel.Lesson8.HomeWork;

class Sofa{
    private String name;
    private int height;
    private int width;

    public Sofa(){
    }

    public Sofa(String name) {
        this.name = name;
    }

    public Sofa(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Sofa(String name, int height, int width) {
        this.name = name;
        this.height = height;
        this.width = width;


    }

    @Override
    public String toString() {
        return "Sofa{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}