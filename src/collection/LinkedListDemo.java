package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList<String> ls = new LinkedList<>();
        ls.add("vishruti");
        ls.add("komal");
        ls.add("adi");
        ls.add("mitali");
        ls.addLast("dhruti");
        ls.addFirst("priya");
        LinkedList<String> ls1 = new LinkedList<>();
        ls1.add("vishrutiii");
        ls1.add("komalll");
        ls1.add("adiii");
        ls.addAll(ls1);
        Iterator ir = ls.iterator();
        while (ir.hasNext()){
            System.out.println(ir.next());
        }
        Iterator ir1 = ls.descendingIterator();
        while (ir1.hasNext()){
            System.out.println(ir1.next());


        }
    }
}
