package collections;

import java.util.*;
enum days{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
public class enum1 {
    public static void main(String... args){
        Set<days> set1 = EnumSet.allOf(days.class);
        System.out.println("Weekdays: "+set1);
        Set<days> set2 = EnumSet.noneOf(days.class);
        System.out.println("Weekdays"+set2);
    }
}
