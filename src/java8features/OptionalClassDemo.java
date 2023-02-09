package java8features;

import java.util.Optional;

public class OptionalClassDemo {
    public static Optional<String> getname(){
        String name="v";
        return Optional.ofNullable(name);
    }
    public static void main(String[] args){
        String str ="this is optional";
        if ((str==null)){
            System.out.println("this string is null");

        }else {
            System.out.println(str.length());
        }
        Optional<String> op=Optional.ofNullable(str);
        System.out.println(op.isPresent());
        System.out.println(op.get());
        System.out.println(op.orElse("no value"));

       Optional<String> nameOptional= getname();
       System.out.println(nameOptional.orElse("null return"));





//



    }

}
