package javaIOPkg;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferInputEx {
    public static void main(String[] args) throws IOException {
        FileInputStream inf = new FileInputStream("src/javaIOPkg/bufferin.txt");
        BufferedInputStream bin = new BufferedInputStream(inf);
        int i=0;
        while((i=bin.read())!=-1){
            System.out.print((char)i);

        }
    }
}
