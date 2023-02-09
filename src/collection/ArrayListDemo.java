package collection;
import java.util.*;

public class ArrayListDemo {
    public  static  void main(String[] args){
        ArrayList<String> al = new ArrayList<String>();
//        Scanner sc = new Scanner(System.in);
//        String nane = sc.nextLine();
        al.add("vishruti");
        al.add("adi");
        al.add("vishruti");

        al.add("komal");
        al.add("mitali");

//        al.add(null); --> sorting ma error
//        Collections.sort(al);


        Iterator ir = al.iterator();
//        al.set(2,"asha");



        while(ir.hasNext()){
            System.out.println(ir.next());
        }
        System.out.println(al.contains("adi"));
        for (String n:al) {
            System.out.println(n);

        }
//            System.out.println(al.get(0));
System.out.println("ListIterator..........");

        // ListIterator
        ListIterator lr = al.listIterator(2);
        while(lr.hasNext()){
            System.out.println(lr.next());
        }
        // Reverse list
        System.out.println("reverse list.......");
        ListIterator reverslist = al.listIterator(al.size());
        while (reverslist.hasPrevious()){
            System.out.println(reverslist.previous());
        }
//        ArrayList list=new ArrayList();
//        list.add(1);
//        list.add("aadi");
//        System.out.println(list);

        // using for loop traverse
        System.out.println("using for loop traverse");
        for (int i=0; i< al.size();i++){
            System.out.println(al.get(i));
        }
        // using foreach() method
        System.out.println("using foreach() method");
        al.forEach(a->{
            System.out.println(a);
        });
        Collections.sort(al,Collections.reverseOrder());
        Iterator ir3 = al.iterator();
        while ((ir3.hasNext())){
            System.out.println("reverse order"+ir3.next());
        }


    }
}