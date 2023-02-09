package java8features;

import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringJoining {
    public static void main(String[] args){
        StringJoiner sj = new StringJoiner("-","(",")" );
        sj.add("3");
        sj.add("6");
        sj.add("7");
        System.out.println(sj);

        Stream<String> st = Stream.of("vishruti","adi","asha");
        String s= st.collect(Collectors.joining(",","{","}"));
        System.out.println(s);
        String.join("{","vishruti");
        System.out.println( String.join("/","vishruti","adi"));







    }
}
