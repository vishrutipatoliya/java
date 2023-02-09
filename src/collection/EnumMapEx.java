package collection;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapEx {
    public  static void main(String[] args){
        EnumMap<day,String> em = new EnumMap<day, String>(day.class);
        em.put(day.MONDAY,"2");
        em.put(day.SUNDAY,"1");


for (Map.Entry m:em.entrySet()){
    System.out.println(m.getValue());
}




    }
    enum day{
        SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY;


    }

}

