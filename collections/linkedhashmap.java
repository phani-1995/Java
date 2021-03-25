package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedhashmap {
    public static void main(String... args){
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();

        map.put(100,"Amit");
        map.put(101,"Suresh");
        map.put(102,"kranthi");

        for(Map.Entry i:map.entrySet()){
            System.out.println(i.getKey()+" "+i.getValue());
        }

    }
}
