package com.hillel.Lesson7.Homework;

public class Dog {

    private String nameDog;

    private String breedDog;

    private int expensesDog;

    public Dog(String nameDog, String breedDog, int expensesDog) {
        this.nameDog = nameDog;
        this.breedDog = breedDog;
        this.expensesDog = expensesDog;
    }

    public String getNameDog(){
        return nameDog;
    }
    public void setName(String nameDog){
        this.nameDog = nameDog;
    }


    public String getBreedDog(){
        return breedDog;
    }
    public void setBreedDog(String breedDog){
        this.breedDog = breedDog;
    }


    public int getExpensesDog(){
        return expensesDog;
    }
    public void setExpensesDog(int expensesDog){
        this.expensesDog = expensesDog;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "nameDog='" + nameDog + '\'' +
                ", breedDog='" + breedDog + '\'' +
                ", expensesDog=" + expensesDog +
                '}';
    }
}
