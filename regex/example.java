package regex;
import java.util.regex.*;
public class example {
    public static void main(String... args){
        // method 1
        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("as");
        boolean b = m.matches();
        System.out.println(b);

        // method 2
        boolean b2 = Pattern.compile(".s").matcher("as").matches();
        System.out.println(b2);

        // method 3
        boolean b3 = Pattern.matches(".s","as");
        System.out.println(b3);
    }
}
