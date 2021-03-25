package Fileio;
import java.io.*;
public class sequentialinput {
    public static void main(String... args){
        try{
            FileInputStream fip = new FileInputStream("abc.txt");
            FileInputStream fip1 = new FileInputStream("test.txt");
            SequenceInputStream seq = new SequenceInputStream(fip, fip1);
            int j;
            while((j=seq.read())!=-1){
                System.out.print((char)j);
            }

            seq.close();
            fip.close();
            fip1.close();
        }
        catch (Exception e){
            System.out.print(e);
        }
    }
}
