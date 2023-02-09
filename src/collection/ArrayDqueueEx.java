package collection;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ArrayDqueueEx {
    public static void main(String[] args) {
        ArrayDeque<Integer> pq = new ArrayDeque();
        pq.add(33);
        pq.add(12);
        pq.add(55);
        pq.add(76);
        pq.addFirst(66);
        pq.addFirst(66);
        pq.addLast(77);

        System.out.println(pq);
        pq.poll();
        pq.pollLast();
        System.out.println(pq);
        System.out.println(pq.peekLast());




    }
}