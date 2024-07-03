import java.util.*;
public class Find_k_closest{
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((c,d) -> c.diff == d.diff ? c.num - d.num : c.diff - d.diff);

        for(int i : arr){
            pq.add(new Pair(i,Math.abs(i-x)));
        }

        List<Integer> l = new ArrayList<>();
        int i=0;
        while(k>0){
            l.add(pq.remove().num) ;
            k--;
        }
        Collections.sort(l);
        return l;

    }

    static class Pair{
        int num;
        int diff;
        Pair(int num, int diff){
            this.num = num;
            this.diff = diff;
        }
    }

    public static void main(String[] args) {

        int a[] = {0,0,1,2,3,3,4,7,7,8};

       List<Integer> l = findClosestElements(a,3,5);

       for(int i=0;i<l.size();i++){
        System.out.print(l.get(i) + " ");
       }
    }
}