package Lesson9.HomeWork;

import java.io.File;
import java.io.IOException;
final class Admin extends User{
    public static void main(String[] args) throws IOException {
        User user =new User();
        Support support = new Support();
        Admin admin = new Admin();
        user.writeToFile("name \n", "surname \n", "email \n", "password \n", "sex \n", "country \n");
        user.readFromFile(myTextFile);
        support.readsFromFileСheck(myTextFile);
        admin.trueOfFalse();

    }

    public Admin() {
        super();
    }

    public Admin(String name, String surname, String email, String password, String sex, String country) {
        super(name, surname, email, password, sex, country);
    }

    public void trueOfFalse (){
        File f = new File(myTextFile);
        if (f.delete()) {
            f.delete();
            System.out.println("Файл удален");
        }
        else
            System.out.println("Файл пустой");
    }
}