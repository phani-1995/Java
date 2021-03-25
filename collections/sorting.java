package collections;

import java.util.*;

public class sorting {
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>();

        list.add("Kathik");
        list.add("Mahesh");
        list.add("Kriti");

        Collections.sort(list);
        for (String i:list) {
            System.out.println(i);
        }

        System.out.println("Sorting numbers");

        ArrayList<Integer> l2 = new ArrayList<Integer>();

        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.add(5);

        Collections.sort(l2);

        for (Integer j:l2) {
            System.out.println(j);
        }
    }
}
