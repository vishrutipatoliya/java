package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args){
        Map<Integer,String> m = new HashMap<>();
        m.put(2,"vish");
        m.put(1,"adi");
        m.put(3,"asha");
        m.put(3,"asha");

        System.out.println(m);
        System.out.println(m.get(3));


        if(!m.containsKey(1)){
            m.put(1,"mitali");
        }
        System.out.println(m);
        for (Map.Entry<Integer ,String> p:m.entrySet()){

            System.out.println(p);
            System.out.println(p.getKey());
            System.out.println(p.getValue());



        }
        System.out.println(m.containsKey(6));
        System.out.println(m.isEmpty());


    }
}
