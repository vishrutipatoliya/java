package java8features;

import java.lang.reflect.Method;

class PersonC{
    public void show(){

    }
}

public class ReflectionDemo extends PersonC{
    public static void main(String[] args){
        PersonC p = new PersonC();
        Class c = p.getClass();
        System.out.println(c);

        String name = c.getName();
        System.out.println(name);

        Method m[] = c.getDeclaredMethods();
        for (Method a:m){
            System.out.println(a);
        }
        Class sc =c.getSuperclass();
//        String sname= sc.getName();
        System.out.println(sc.getName());



    }
}
