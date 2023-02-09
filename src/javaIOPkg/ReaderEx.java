import java.io.*;  
public class ReaderEx {  
    public static void main(String[] args) {  
        try {  
            Reader r = new FileReader("readerfile.txt");  
            int data = r.read();  
            while (data != -1) {  
                System.out.print((char) data);  
                data = r.read();  
            }  
            r.close();  
        } catch (Exception ex) {  
            System.out.println(ex.getMessage());  
        }  
    }  
}  
