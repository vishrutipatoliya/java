package collection;

import java.util.Arrays;
import java.util.LinkedList;

public class ListToArray {
    public static void main(String[] args){
        LinkedList<String> ls = new LinkedList<>();
        ls.add("vishruti");
        ls.add("komal");
        ls.add("adi");
        ls.add("mitali");
        String[] array = ls.toArray(new String[ls.size()]);
        System.out.println(Arrays.toString(array));
    }
}
