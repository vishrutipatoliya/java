package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class UserDefineArList {
    public static void main(String[] args){
        Students s1 = new Students(1,"vishruti","B");
        Students s2 = new Students(2,"adi","a");
        ArrayList<Students> al = new ArrayList<Students>();
        al.add(s1);
        al.add(s2);
        Iterator ir = al.iterator();
        while (ir.hasNext()){
            Students st = (Students)ir.next();
            System.out.println(st.rollno+" "+st.name+" "+st.div);

        }

    }

}
class Students{
    int rollno;
    String name;
    String div;

    Students(int rollno, String name, String div){
        this.rollno = rollno;
        this.name = name;
        this.div= div;
    }
}
