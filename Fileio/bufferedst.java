package Fileio;
import java.io.*;
public class bufferedst {
    public static void main(String... args){
        try {
            FileOutputStream f1 = new FileOutputStream("xyz.txt");
            BufferedOutputStream bout = new BufferedOutputStream(f1);
            String s = "Welcome to java";
            byte b[] = s.getBytes();
            bout.write(b);
            bout.flush();
            bout.close();
            f1.close();


        }
        catch (Exception e){
            System.out.print(e);
        }

    }
}
