package java8features;

public class LambdaMultiStat {
    public static void main(String[] args) {
        Message ms=(String m)->{
            String s = "V";
            return m+s;


        };
       System.out.println( ms.msg("hello..."));




    }
}

interface Message {
    public String msg(String m);
}
