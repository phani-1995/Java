// Reading input stream and writing output stream
package Fileio;
import java.io.*;
public class readwrite {
    public static void main(String... args){
        try{
            FileInputStream fip = new FileInputStream("abc.txt");
            FileInputStream fip1 = new FileInputStream("test.txt");
            FileOutputStream fout = new FileOutputStream("wrt.txt");
            SequenceInputStream seq1 = new SequenceInputStream(fip, fip1);

            int j = 0;
            while ((j=seq1.read())!=-1){
                fout.write(j);
            }
            seq1.close();
            fip.close();
            fip1.close();
            System.out.println("Success....!!!!!!!!");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
