package collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashtableEx {
    public static  void main(String[] args){
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(2,"vishruti");
        ht.put(1,"asha");
        System.out.println(ht);
        System.out.println(ht.getOrDefault(2,"not "));
        System.out.println(ht.putIfAbsent(3,"adi"));
        System.out.println("remove "+ht.remove(1));
        System.out.println(ht);

        Iterator ir = ht.keySet().iterator();
        while ((ir.hasNext())){
            System.out.println("this is"+ir.next());
        }



        for(Map.Entry hm: ht.entrySet()){
            System.out.println(hm.getKey()+"  "+hm.getValue());
        }

    }



}
