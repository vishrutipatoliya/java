package collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortStudents implements Comparable<SortStudents> {
    public static  void main(String[] args){
        ArrayList<SortStudents> ar = new ArrayList<>();
        ar.add(new SortStudents("vishruti",2));
        ar.add(new SortStudents("adi",1));
        ar.add(new SortStudents("asha",3));
        System.out.println(ar);
        Collections.sort(ar);
        // comparable
        System.out.println(ar);






    }
    private  String name;
    private  int empid;
    SortStudents(String name,int empid){
        this.name=name;
        this.empid=empid;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SortStudents{" +
                "name='" + name + '\'' +
                ", empid=" + empid +
                '}';
    }

    public int getEmpid() {
        return empid;
    }

    @Override
    public int compareTo(SortStudents o) {
        return this.empid-o.empid;
    }
}
