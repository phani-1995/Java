package Fileio;

import java.io.*;
import java.security.PermissionCollection;

public class permissions {
    public static void main(String... args){
        String srg = "/home/phanindrajallanram/IdeaProjects/Java_operators/src/Fileio/abc.txt";
        FilePermission file = new FilePermission("/home/phanindrajallanram/IdeaProjects/Java_operators/src/Fileio/-", "read");
        PermissionCollection permission = file.newPermissionCollection();
        permission.add(file);

        FilePermission file1 = new FilePermission(srg, "write");
        permission.add(file1);
        if(permission.implies(new FilePermission(srg, "read,write"))){
            System.out.println("Read write permissions was provided"+srg);
        }
        else {
            System.out.println("Permissions were not provided"+srg);
        }
    }
}
