package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToString {
    public static void main(String[] args){
        String[] name={"vishruti","adi","dhruti"};
        System.out.println(Arrays.toString(name));
        List<String> ls= new ArrayList<String>();
        for (String nameList:name){
            ls.add(nameList);
        }
        System.out.println(ls);
        Iterator<String> ir = ls.iterator();
        while (ir.hasNext()){
            System.out.println(ir.next());
        }

    }
}
