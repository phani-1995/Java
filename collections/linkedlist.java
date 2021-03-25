package collections;

import java.util.*;
public class linkedlist {
    public static void main(String... args){
        LinkedList<String> list = new LinkedList<String>();
        list.add("Ravi");
        list.add("Pavi");
        list.add("Ramu");
        list.add("Karthik");
        Iterator itr = list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}