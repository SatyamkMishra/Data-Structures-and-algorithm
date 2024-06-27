import java.util.*;
class Priority_queue_jcf{
    public static void main(String[] args){

        PriorityQueue<Integer> p = new PriorityQueue<>();
        p.add(3);
        p.add(4);
        p.add(1);
        p.add(7);
        while(!p.isEmpty()){
            System.out.println(p.peek() + " ");
            p.remove();
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);
        while(!pq.isEmpty()){
            System.out.print(pq.peek() + " ");
            pq.remove();
        }
    }
}