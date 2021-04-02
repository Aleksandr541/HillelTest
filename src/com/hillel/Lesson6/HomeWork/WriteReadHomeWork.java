package com.hillel.Lesson6.HomeWork;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;


public class WriteReadHomeWork {
    static String path = "C:\\Users\\HP\\IdeaProjects\\HillelTest\\src\\com\\hillel\\Lesson6\\HomeWork\\Zxc\\myTextFile.txt";

    public static void main(String[] args) throws IOException {
        Path pathToFile = Paths.get(path);
        if (!Files.exists(pathToFile.getParent()));
        Files.createDirectories(pathToFile.getParent());

        writeToFile(path);
        readFromFile(path);
        readFromFileScanner(path);

    }

    private static void writeToFile(String pathToFile) throws IOException {
        FileWriter fileWriter = new FileWriter(pathToFile);
        fileWriter.write("Сквозь волнистые туманы\n");
        fileWriter.write("Пробирается луна\n");
        fileWriter.write("На печальные поляны\n");
        fileWriter.write("Льет печально свет она\n");
        fileWriter.close();
    }

    private static void readFromFile(String pathToFile) throws IOException {
        char[] myCharArray = new char[1000];
        FileReader fileReader = new FileReader(pathToFile);
        fileReader.read(myCharArray);

//        System.out.println("File have ben read \n");
        System.out.println(Arrays.toString(myCharArray));
        fileReader.close();

    }

    private static void readFromFileScanner(String pathToFile) throws IOException {
        FileReader fileReader = new FileReader(pathToFile);
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()) {
            String fileString = scanner.nextLine();
//            System.out.println("Read one string from file:  \n");
            System.out.println(fileString);
        }
        scanner.close();
        fileReader.close();
    }
}
