import java.util.*;
public class Sort_based_frequency {

    static class Pair{
        int num;
        int freq;
        Pair(int num, int freq){
            this.num = num;
            this.freq = freq;
        }
    }
    public static void arr(int a[]){
        HashMap<Integer,Integer> h = new HashMap<>();

        for(int i=0;i<a.length;i++){
            h.put(a[i],h.getOrDefault(a[i],0)+1);
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y)-> x.freq==y.freq ? y.num - x.num : x.freq - y.freq);


        for(int k : h.keySet()){
            pq.add(new Pair(k,h.get(k)));
        }
        int j = 0;
        int arr[] = new int[a.length];
        while(!pq.isEmpty()){
            int n = pq.peek().num;
            int f = pq.peek().freq;
            pq.poll();
            for(int i=0;i<f;i++){
                arr[j++] = n;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int arr[] = {2,2,1,3,3,3};

        arr(arr);

       
    }
}
