package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public  static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();
        q.add(22);
        q.offer(44);
        q.add(31);
        q.add(19);
        System.out.println(q);
        q.forEach(a->System.out.println(a));
        q.stream().forEachOrdered(a->System.out.println(a));

        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.poll());



//        Iterator i= q.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }


    }
}
