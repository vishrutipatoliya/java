package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        NavigableMap<Integer, String> m = new TreeMap<>();
        System.out.println(m.isEmpty());

        m.put(2, "vish");
        m.put(1, "adi");
        m.put(3, "asha");
        m.put(4, null);

        System.out.println(m);
        System.out.println(m.descendingMap());

        System.out.println(m);


        System.out.println(m.get(2));
        System.out.println(m.isEmpty());




    }
}
