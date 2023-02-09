package java8features;

import javax.script.*;
import java.io.*;
public class NashronDemo {
    public static void main(String[] args) throws Exception{
        // Creating script engine  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
        // Reading Nashorn file
        ee.eval(new FileReader("src/java8features/hello.js"));
    }
}  