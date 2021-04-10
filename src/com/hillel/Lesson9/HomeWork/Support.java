package Lesson9.HomeWork;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

final class Support extends User {
    public static void main(String[] args) throws IOException {
        User user = new User();
        Support support =new Support();
        user.writeToFile("name \n", "surname \n", "email \n", "password \n", "sex \n", "country \n");
        user.readFromFile(myTextFile);
        support.readsFromFileСheck(myTextFile);


    }

    public Support() {
        super();
    }

    public Support(String name, String surname, String email, String password, String sex, String country) {
        super(name, surname, email, password, sex, country);
    }

   public boolean readsFromFileСheck(String stringToCheck) throws IOException {
        FileReader fileReader = new FileReader(myTextFile);
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()) {
            String fileString = scanner.nextLine();
            if (stringToCheck.equals(fileString)) {
                fileReader.close();
                scanner.close();
                return true;
            }
        }
        fileReader.close();
        scanner.close();
        return false;

    }
//    boolean readsFromFileСheck( ) throws IOException {
//        FileReader fileReader = new FileReader(myTextFile);
//        Scanner scanner = new Scanner(fileReader);
//          boolean delete;
//        if (scanner.hasNextLine()) {
//            String fileString = scanner.nextLine();
//            System.out.println("Содежит");
//            delete = true;
//        }else{
//            System.out.println("Не содержит");
//            delete = false;
//        }
//        fileReader.close();
//        scanner.close();
//        return delete;
//    }
//}
}