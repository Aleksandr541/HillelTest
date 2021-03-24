package com.hillel.Lesson6.HomeWork;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class WriteReadHomeWork {

    static String pathToFile = "C:\\Users\\HP\\IdeaProjects\\HillelTest\\src\\com\\hillel\\Lesson6\\HomeWork\\myTextFile.txt";
    public static void main(String[] args)throws IOException {
        writeToFile(pathToFile);
        readFromFile(pathToFile);
        readFromFileByScanner(pathToFile);

    }
    private static void writeToFile (String pathToFile)throws IOException{
        FileWriter fileWriter = new FileWriter(pathToFile);
        fileWriter.write("Все важные встречи всегда случайные.\n");
        fileWriter.write("Самые верные подданные-предатели,\n");
        fileWriter.write("Цирковые клоуны - все печальные,\n");
        fileWriter.write("А угрюмые скептики - все мечтатели.\n");
        fileWriter.close();
    }
    private static void readFromFile(String pathToFile)throws IOException{
        char[] myCharArray = new char[1000];

        FileReader fileReader = new FileReader(pathToFile);
        fileReader.read(myCharArray);

        System.out.println("File have ben read \n");
        System.out.println(Arrays.toString(myCharArray));
        fileReader.close();


    }
    private static void readFromFileByScanner (String pathToFile)throws IOException{
        FileReader fileReader = new FileReader(pathToFile);
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()){
            String fileString = scanner.nextLine();
            System.out.println("Read one string from file :");
            System.out.println(fileString);

        }
        scanner.close();
        fileReader.close();


    }
}
