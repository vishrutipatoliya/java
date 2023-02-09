package collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args){
        PriorityQueue pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(33);
        pq.add(12);
        pq.add(55);
        pq.add(76);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());


    }

}
