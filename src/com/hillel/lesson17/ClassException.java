package lesson17;

import java.util.ArrayList;
import java.util.List;

public class ClassException {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        int z = 0;
        for (int i = 1; i <= 100; i++) {
            list.add(new Object());
        }
        System.out.println(list);
        for (int i = list.size() - 1; i >= 0; i--) {
            if (i % 2 != 0) {
                list.remove(i);
                z++;
            }
        }
        System.out.println(list);
        System.out.println(z);
    }
}

