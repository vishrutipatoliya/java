package javaIOPkg;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamEx {
    public static void main(String[] args) throws IOException {
        FileOutputStream f=new FileOutputStream("src/javaIOPkg/dataoutstream.txt");
        DataOutputStream dout = new DataOutputStream(f);
        dout.writeInt(47);

        dout.flush();
        dout.close();

    }
}
