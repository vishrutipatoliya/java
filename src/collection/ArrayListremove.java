package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListremove {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(3);
        al.add(76);

        ArrayList<Integer> al2 = new ArrayList<Integer>();
        al2.add(11);
        al2.add(3);

        al2.add(33);

        al2.add(776);
        al.addAll(al2);
//        al.clear();

//        al.removeAll(al2);
//        al.retainAll(al2);



        Iterator ir = al.iterator();
        while (ir.hasNext()){
            System.out.println(ir.next());
        }
    }
}
