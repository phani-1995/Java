package Fileio;
import java.io.Console;
public class consoleclas {
    public static void main(String args[]){
        Console c = System.console();
        System.out.println("enter the name:");
        String n = c.readLine();
        System.out.println("Welcome "+n);

        // for password
        Console c2 = System.console();
        System.out.print("Enter password: ");
        char[] p1= c2.readPassword();
        String pass  = String.valueOf(p1);
        System.out.println("Password you entered is: "+pass);
    }
}
