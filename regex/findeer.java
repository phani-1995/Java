package regex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class findeer {
    public static void main(String... args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Enter the regex pattern: ");
            Pattern p1 = Pattern.compile(sc.nextLine());
            System.out.print("Enter the text: ");
            Matcher matcher = p1.matcher(sc.nextLine());
            boolean found =false;
            while (matcher.find()) {
                System.out.println("I found the text "+matcher.group()+" starting at index "+
                        matcher.start()+" and ending at index "+matcher.end());
                found = true;
            }
            if(!found){
                System.out.println("Not found");
            }
        }
    }
}
