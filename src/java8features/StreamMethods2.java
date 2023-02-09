package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods2 {
    public static void main(String[] args){
        List<String> ls = Arrays.asList("Vishruti","vishva","komal","Vish");
        List<String> lsNew = ls.stream().filter(e->e.startsWith("V")).collect(Collectors.toList());
        System.out.println(lsNew);
        lsNew.forEach(i->{
            System.out.println(i);
        });

        List<Integer> ls1 = Arrays.asList(23,5,6,7,1,66);
        List<Integer> ls1New = ls1.stream().map(i -> i *i ).collect(Collectors.toList());
        ls1New.forEach(System.out::println);
        System.out.println("sorting list :");
      ls1.stream().sorted().forEach(System.out::println);
        Integer i=  ls1.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println("maximum number of list "+i);
        int min = ls1.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println("minimum number of list "+min);






    }

}
