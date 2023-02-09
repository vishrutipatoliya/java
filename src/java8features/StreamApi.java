package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.List.*;

public class StreamApi {
    public static void main(String[] args){
        List<Integer> ls = Arrays.asList(23,66,88,55,66,87);
        List<Integer> lsEven =  new ArrayList<Integer>();
        for(Integer i:ls){
            if(i%2==0){
                lsEven.add(i);
            }
        }
        System.out.println(ls);
        System.out.println(lsEven);
        Stream<Integer> st = ls.stream();
        List<Integer> newList = st.filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newL = ls.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(newL);
        List<Integer> ls3 = ls.stream().filter(i -> i > 60).collect(Collectors.toList());
        System.out.println(ls3);
        ls3.forEach(e->{
            System.out.println(e);
        });















    }
}
