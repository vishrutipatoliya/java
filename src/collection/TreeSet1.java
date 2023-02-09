package collection;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args){
        TreeSet<String> al=new TreeSet<String>();

        al.add("b");
        al.add("a");
        al.add("c");
        al.add("d");
        al.add("e");
        System.out.println(al);
        Iterator ir = al.iterator();
        while (ir.hasNext())
        {
            System.out.println(ir.next());
        }
        Iterator ir1 = al.descendingIterator();
        while (ir1.hasNext())
        {
            System.out.println(ir1.next());
        }

        System.out.println("subset "+al.subSet("a",false,"d",false));
        System.out.println("hadset"+al.headSet("c",true));
//        System.out.println("decending set"+al.descendingSet());
        System.out.println("tailset"+al.tailSet("d",false));
        System.out.println("delete firdst elemrnt  "+al.pollFirst());
        System.out.println(""+al);

    }

}
