package javaIOPkg;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputFileStreamEx {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("src/javaIOPkg/out.txt");
        fout.write(65);
        String s ="vishruti";
        byte[] b= s.getBytes();
        fout.write(b);

        fout.close();
        System.out.println("success...");

    }
}
