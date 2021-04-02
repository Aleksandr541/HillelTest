public class ClassesAndObjekts {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("");
        person1.setAge(-1);
        System.out.println("Выводим м main методе "+person1.getName());
        System.out.println("Выводим м main методе"+person1.getAge());
            }
}
class Person{
   private String name;
   private int age;

    public void setName(String userName) {

        if(userName.isEmpty()){
            System.out.println("Ты ввел пустое имя: ");
        }else{name = userName;}
    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge) {
        if (userAge<0){
            System.out.println("You enter voice: ");
        }else {age = userAge;}
    }

    public int getAge() {
        return age;
    }

    void setNameAndAge(String username, int userAge){
        name=username;
        age = userAge;
        return;

    }
    void speak(){
        for (int i = 0; i < 3; i++) {
            System.out.println("My name: "+name+ " Me "+age+" yers");
        }
    }
    int calculateYersToRetiremet(){
        int years =65-age;
        return years;
    }

    void sayHello(){
        System.out.println("Hi ");
    }

}