package collections;
import java.util.*;
public class arrylist {
    public static void main(String... args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Pavi");
        list.add("Ramu");
        Iterator itr = list.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
