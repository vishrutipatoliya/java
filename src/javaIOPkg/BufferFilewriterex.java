
import java.io.*;  
public class BufferFilewriterex {  
public static void main(String[] args) throws Exception {     
    FileWriter writer = new FileWriter("readfile.txt");  
    BufferedWriter buffer = new BufferedWriter(writer);  
    buffer.write("Welcome.");  
    buffer.close();  
     
    }  
}  
