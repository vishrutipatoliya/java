package javaIOPkg;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx {
    public static void main(String[] args) throws FileNotFoundException {
        FileOutputStream f3 = new FileOutputStream("src/javaIOPkg/print.txt");
        PrintStream p = new PrintStream(f3);
        p.print("hello ");
        p.println("vishruti");
    }
}
