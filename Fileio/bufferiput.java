package Fileio;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class bufferiput {
    public static void main(String... args){
        try{
            FileInputStream fip = new FileInputStream("abc.txt");
            BufferedInputStream bout1 = new BufferedInputStream(fip);
            int i =0 ;
            while((i=fip.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch (Exception e){
            System.out.print(e);
        }
    }
}
