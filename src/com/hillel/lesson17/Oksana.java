package lesson17;

import java.util.ArrayList;

public class Oksana {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();

        int z = 0;
        for (int i = 1; i <= 50; i++) {
            list.add(new Class1(i));
            z++;
        }
        for (int i = 51; i <= 100; i++) {
            list.add(new Class2(i));
            z++;
        }
        for (int i =list.size()-1;i>50 ; i--) {
            list.remove(i);
            z--;
        }
        System.out.println(z);

        System.out.println(list);
    }
}