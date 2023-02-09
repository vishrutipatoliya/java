package java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
        Stream<Objects> st = Stream.empty();
        st.forEach(e->{
            System.out.println(e);
        });
        String name[] = {"vishruti","komal","asha"};
        Stream<String> st1= Stream.of(name);
        st1.forEach(i->{
            System.out.println(i);
        });
// 3 way to use stream

        Stream<Object> streamBuilder = Stream.builder().build();
// 4 way to use stream
        int x[]={1,3,4};
        IntStream st4 = Arrays.stream(new int[] {2,4,6,3});
        st4.forEach(e->{
            System.out.println(e);
        });

        List<Integer> ls = new ArrayList<>();
        ls.add(11);
        ls.add(23);
        ls.add(44);
        Stream<Integer> st5 = ls.stream();
        st5.forEach(i->{
            System.out.println(i);
        });

        Stream<Integer> st6 = Stream.of(1,4,8);



    }

}
