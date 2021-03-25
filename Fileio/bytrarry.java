package Fileio;
import java.io.*;
public class bytrarry {
    public static void main(String args[]){
        try{
            byte[] b1 = {10,20,44,55,33};
            ByteArrayInputStream byt= new ByteArrayInputStream(b1);
            int k=0;
            while((k=byt.read())!=-1){
                char ch = (char)k;
                System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
