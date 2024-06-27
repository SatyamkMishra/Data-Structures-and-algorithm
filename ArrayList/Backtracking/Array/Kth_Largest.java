import java.util.*;
public class Kth_Largest{

    public static int largest(int a[], int k){

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<a.length;i++){
            pq.add(a[i]);
            if(pq.size()>k){
                pq.poll();
            }
        }
        return pq.peek();
    }
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6};

        System.out.println("Kth largest element is " + largest(a,3));
    }
}