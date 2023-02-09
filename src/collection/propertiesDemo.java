package collection;
import java.util.*;
import java.io.*;

public class propertiesDemo {


        public static void main(String[] args)throws Exception{

            Properties p=new Properties();
            p.setProperty("name","vishruti patoliya");
            p.setProperty("email","vishruti@gmail.com");
            System.out.println(p.getProperty("name"));

            p.store(new FileWriter("info.properties")," Properties Example");

        }
    }

