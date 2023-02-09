package javaIOPkg;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamEx {
    public static void main(String[] args) throws IOException {
        FileInputStream i1 = new FileInputStream("src/javaIOPkg/i1.txt");
        FileInputStream i2 = new FileInputStream("src/javaIOPkg/i2.txt");
        FileInputStream i3 = new FileInputStream("src/javaIOPkg/hel.txt");

        FileOutputStream io = new FileOutputStream("src/javaIOPkg/out.txt");
        SequenceInputStream sqi = new SequenceInputStream(i1,i2);
//        int x=0;
//        while ((x=sqi.read())!=-1){
//            System.out.print((char)x);
//            io.write(x);
//        }

        Vector v=new Vector();
        v.add(i1);
        v.add(i2);
        v.add(i3);
        Enumeration e = v.elements();
        SequenceInputStream sqi1 = new SequenceInputStream(e);
        int x1=0;
        while ((x1=sqi1.read())!=-1){
            System.out.print((char)x1);
            io.write(x1);
        }


        i1.close();
        i2.close();
        i3.close();

        sqi.close();
        sqi1.close();


    }
}
