package javaIOPkg;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputEx {
    public static void main(String[] aargs) throws IOException {
        FileOutputStream fot = new FileOutputStream("src/javaIOPkg/bufferout.txt");
        BufferedOutputStream b= new BufferedOutputStream(fot);
        String s ="vishruti";
        byte[] b1= s.getBytes();
        b.write(b1);
        b.flush();
        b.close();
        b.close();
        System.out.println("success");

    }
}
