public class LessonYoutobe9 {
    public static void main(String[] args) {
        Human h1 = new Human("Bob",30);
        Human h2 = new Human("Tom",30);
        h1.printOfNamberPeople();
        h2.printOfNamberPeople();
        Human h3 = new Human("Zas",25);
        h1.printOfNamberPeople();
        h2.printOfNamberPeople();
        h3.printOfNamberPeople();

    }

}
class Human{
   private String name;
   private int age;
   private int countPeople;

    public Human(String name,int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }


    public void setName(String name){this.name=name;}
    public void setAge(int age){this.age=age;}

    public void printOfNamberPeople(){
        System.out.println("Number of people is  "+ countPeople);
    }
}
