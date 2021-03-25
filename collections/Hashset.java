package collections;

import java.util.*;
public class Hashset {
    public static void main(String... args){
        Set<String> s1 = new HashSet<String>();
        s1.add("Ravi");
        s1.add("Ramu");
        s1.add("Ramesh");
        s1.add("Ramu");

        Iterator itr = s1.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }

}
