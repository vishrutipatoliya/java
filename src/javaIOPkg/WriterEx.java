import java.io.*;  
public class WriterEx {  
    public static void main(String[] args) {  
        try {  
            Writer w = new FileWriter("writerfile.txt");  
            String content = "I love my country";  
            w.write(content);  
            w.close();  
            System.out.println("Done");  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
}  
