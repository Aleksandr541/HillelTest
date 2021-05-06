package lesson17;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vlad {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:  ");
        String str = scanner.nextLine();
        System.out.println("Enter name:  ");
        String str2 = scanner.nextLine();
        System.out.println("Enter name:  ");
        String str3 = scanner.nextLine();
        System.out.println("Enter name:  ");
        String str4 = scanner.nextLine();
        String lastName = "Shvetc";
        map.put(str,lastName);
        map.put(str2,lastName);
        map.put(str3,lastName);
        map.put(str4,lastName);
        System.out.println(map);
        scanner.close();


    }
}
