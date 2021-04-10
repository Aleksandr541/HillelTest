package Lesson9.HomeWork;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

    public class User {
        public static String myTextFile = "C:\\Users\\HP\\IdeaProjects\\HillelTest\\src\\com\\hillel\\Lesson9\\HomeWork\\myTextFile.txt";
        public static  void main(String[] args) throws IOException {
            Path pathToFile = Paths.get(myTextFile);
            if (!Files.exists(pathToFile.getParent()));
            Files.createDirectories(pathToFile.getParent());

            User user = new User();
            Support support = new Support();
            Admin admin = new Admin();
            boolean isUserOfSupport = user instanceof Support;
            boolean isSupportOfUser = support instanceof User;
            boolean isUserOfAdmin = user instanceof Admin;
            boolean isAdminOfUser = admin instanceof User;
            user.writeToFile("name \n", "surname \n", "email \n", "password \n", "sex \n", "country \n");
            user.readFromFile(myTextFile);
            support.readsFromFileСheck(myTextFile);
        }

        //    имя, фамилия, почта, пароль, пол, стран
        private String name;
        private String surname;
        private String email;
        private String password;
        private String sex;
        private String country;

        public User() {
        }

        public User(String name) {
            this.name = name;
        }

        public User(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public User(String name, String surname, String email) {
            this.name = name;
            this.surname = surname;
            this.email = email;
        }

        public User(String name, String surname, String email, String password) {
            this.name = name;
            this.surname = surname;
            this.email = email;
            this.password = password;
        }

        public User(String name, String surname, String email, String password, String sex) {
            this.name = name;
            this.surname = surname;
            this.email = email;
            this.password = password;
            this.sex = sex;
        }

        public User(String name, String surname, String email, String password, String sex, String country) {
            this.name = name;
            this.surname = surname;
            this.email = email;
            this.password = password;
            this.sex = sex;
            this.country = country;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", email='" + email + '\'' +
                    ", password='" + password + '\'' +
                    ", sex='" + sex + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }
//
        public void writeToFile(String name, String surname, String email, String password, String sex, String country ) throws IOException {
            FileWriter fileWriter = new FileWriter(myTextFile,true);
            fileWriter.write(name);
            fileWriter.write(surname);
            fileWriter.write(email);
            fileWriter.write(password);
            fileWriter.write(sex);
            fileWriter.write(country);
            fileWriter.close();
        }


        public final void readFromFile(String pathToFile) throws IOException {
            char[] myCharArray = new char[1000];
            FileReader fileReader = new FileReader(pathToFile);
            fileReader.read(myCharArray);
            System.out.println(Arrays.toString(myCharArray));
            fileReader.close();
        }
    }


