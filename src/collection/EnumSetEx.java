package collection;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public class EnumSetEx {
    public static void main(String[] args){
//        days s =  days.MONDAY;
        Set<days> es = EnumSet.of(days.MONDAY,days.THURSDAY);
        Iterator<days> ir = es.iterator();
        while (ir.hasNext()){
            System.out.println(ir.next());
        }
        Set<days> es1 = EnumSet.allOf(days.class);
        Iterator<days> ir1 = es1.iterator();
        while (ir1.hasNext()){
            System.out.println(ir1.next());
        }
        Set<days> es2 = EnumSet.noneOf(days.class);
        Iterator<days> ir2 = es2.iterator();
        while (ir2.hasNext()){
            System.out.println("week day "+ir2.next());
        }
    }
}
enum days{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY;
}

