package java8features.methodReferences;

public class MyClass {
    public static void walking(){
        System.out.println(" go to walk...");
        getMaxOfTwo mx = Math::max;
       System.out.println( mx.getMax(3,77));
    }

    public String wlcMsg(String name){
        return "hello" +name;
    }
}
