package javaIOPkg;

import java.io.*;

public class DataInputStreamEx {
    public static void main(String[] args) throws IOException {
        FileInputStream f=new FileInputStream("src/javaIOPkg/dataoutstream.txt");
        DataInputStream dout = new DataInputStream(f);
        int i = dout.readInt();
//        double s = dout.readDouble();
        System.out.print(i+"  ");
        dout.close();

    }
}
