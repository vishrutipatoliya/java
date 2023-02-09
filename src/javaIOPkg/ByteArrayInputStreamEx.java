package javaIOPkg;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamEx {
    public static void main(String[] args){
        byte[] a= {37,38,39};

        ByteArrayInputStream bin = new ByteArrayInputStream(a);
        int j=0;
        while ((j=bin.read())!=-1){
            System.out.println((char) j);
        }
    }
}
