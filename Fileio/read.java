package Fileio;
import java.io.*;
public class read {
    public static void main(String args[]){
        try{
            FileInputStream f2 = new FileInputStream("abc.txt");
            int i = 0;
            while((i=f2.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
