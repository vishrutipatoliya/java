package java8features;

import java.util.Arrays;

public class ParallelArraySort {
    public static void main(String[] args){
        int a[]={9,6,1,3,2};
        for (int i:a){
            System.out.println(i);
        }
        Arrays.parallelSort(a,0,3);
        for (int i:a){
            System.out.print(" "+i);
        }
    }
}
