package Fileio;
import java.io.*;
public class writer1 {
    public static void main(String... args){
        try{
            Writer w = new FileWriter("output1.txt");
            String content = "I love my country";
            w.write(content);
            w.close();
            System.out.println("Done");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
