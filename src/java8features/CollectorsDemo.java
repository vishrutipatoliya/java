package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
class  Person{
    int id;
    String name;
    String city;

    double salary;

    Person(int id,String name,String city,double salary){
        this.id=id;
        this.name=name;
        this.city=city;
        this.salary=salary;
    }
}
public class CollectorsDemo {
    public static void main(String[] args){
        List<Person> pl = new ArrayList<>();
        pl.add(new Person(1,"vishruti","una",100));
        pl.add(new Person(3,"adi","una",4000));
        pl.add(new Person(2,"asha","junagdh",200));
        pl.add(new Person(4,"asha","junagdh",300));



//Map<String,List<Person>> plNew = pl.stream().collect(Collectors.groupingBy(Person-> Person.city));
//double sumId = pl.stream().filter(xf->xf.salary>1000).map(xm->xm.salary).collect(Collectors.toList());
//        collect(Collectors.summingDouble(x->x.salary));
        Double salaryList =  pl.stream()
                .filter(s->s.salary>3000)
                .collect(Collectors.summingDouble(x->x.salary));

System.out.println("salaryList  :"+salaryList);





    }
}

