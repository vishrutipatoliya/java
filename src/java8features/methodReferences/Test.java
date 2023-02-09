package java8features.methodReferences;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args){
        walkble w =MyClass::walking;
        w.walk();
        List<Integer> i = new ArrayList<>();
        i.add(8);
        i.add(5);
        i.add(7);
        PrintStream o = System.out;
        i.forEach(o::println);
        i.sort((s1,s2)->s1.compareTo(s2));
        i.sort(Integer::compareTo);

        i.forEach(o::println);

      ArrayList<Integer> ls=  IntStream.range(1,6).boxed().collect(Collectors.toCollection(ArrayList::new ));
        ls.forEach(System.out::println);
    }
}
