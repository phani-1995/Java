package Fileio;
import java.io.FileOutputStream;
//import java.io.*;
public class write {
    public static void main(String... args){
        try{
            FileOutputStream f1 = new FileOutputStream("test.txt");
            String s = "Welcome to Java";
            byte b[] = s.getBytes();
            f1.write(b);
//            f1.write(65);
            f1.close();
            System.out.println("Success");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
