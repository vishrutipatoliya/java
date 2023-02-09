package collection;

import java.util.Iterator;

public class LinkedHashSet {
    public static void main(String[] args) {

        java.util.LinkedHashSet<String> set=new java.util.LinkedHashSet();
        set.add("vishruti");
        set.add("komal");
        set.add("adi");
        set.add("mitali");

        Iterator ir = set.iterator();
        while (ir.hasNext()){
            System.out.println(ir.next());
        }


    }
}