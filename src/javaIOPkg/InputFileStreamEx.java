package javaIOPkg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputFileStreamEx {
    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream("src/javaIOPkg/hel.txt");
        int i=0;

                while (( i=fi.read())!=-1){
                    System.out.print((char)i);

                }

        fi.close();
    }
}