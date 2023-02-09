package javaIOPkg;

import java.io.*;

public class ByteArrayOutputStreamEx {
    public static void main(String[] args) throws IOException {
        FileOutputStream fin = new FileOutputStream("src/javaIOPkg/byteary.txt");
        FileOutputStream fin1 = new FileOutputStream("src/javaIOPkg/byteary1.txt");
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        bao.write(65);
        bao.writeTo(fin);
        bao.writeTo(fin1);



    }
}
