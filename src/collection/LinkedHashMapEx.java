package collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        Map<Integer, String> m = new LinkedHashMap<>();
        m.put(2,"vish");
        m.put(3, "asha");

        m.put(1, "adi");
        m.put(3, "asha");
        m.put(null, null);
        m.remove(2);

        System.out.println(m);
        System.out.println(m);

        for(Map.Entry sm:m.entrySet()){
            System.out.println(("key "+sm.getKey()+" value "+sm.getValue()));
        }




    }
}
