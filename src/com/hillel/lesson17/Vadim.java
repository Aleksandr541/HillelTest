package lesson17;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Vadim<file> {

    public static void main(String[] args) throws IOException {
        File file = new File("zzz.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("kjbkjbkjb.kjb");
        fileWriter.write("kjbkjbkjb.kjb");
        fileWriter.write("kjbkjbkjb.kjb");
        File file2 = new File("zzz2.txt");
        FileReader fileReader = new FileReader(file);
        Scanner scanner = new Scanner(System.in);
        FileWriter fileWriter2 = new FileWriter(file2);
        System.out.println("Enter");
        String a = scanner.nextLine();
        fileWriter2.write(a);
        System.out.println("Enter");
        String a2 = scanner.nextLine();
        fileWriter2.write(a2);
        System.out.println("Enter");
        String a3 = scanner.nextLine();
        fileWriter2.write(a3);
        System.out.println("Enter");
        String a4 = scanner.nextLine();
        fileWriter2.write(a4);
        scanner.close();
        FileReader fileReader2 = new FileReader(file);
        Scanner scanner2 = new Scanner(fileReader2);

        while (scanner2.hasNextLine()) {
            String fileString = scanner2.nextLine();
            System.out.println(fileString);
        }



    }
}
