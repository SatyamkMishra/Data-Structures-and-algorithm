import java.util.*;
public class SortElementByFreq{

    static class Pair{
        int num;
        int freq;
        Pair(int num, int freq){
            this.num = num;
            this.freq = freq;
        }
    }

    public static int[] sort(int a[]){

        HashMap<Integer,Integer> h = new HashMap<>();

        for(int i=0;i<a.length;i++){
            if(h.containsKey(a[i])){
                h.put(a[i],h.get(a[i])+1);
            }else{
                h.put(a[i],1);
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((c,d) -> (c.freq==d.freq) ? d.num-c.num : c.freq - d.freq);

        for(Integer k : h.keySet()){
            pq.add(new Pair(k, h.get(k)));
        }

        int ans [] = new int[a.length];

        int j=0;
        while(!pq.isEmpty()){
            Pair curr = pq.poll();
            int n = curr.num;
            int f = curr.freq;

            for(int i=0;i<f;i++){
                ans[j++] = n;
            }
        }

        return ans;
    }
    public static void main(String[] args){
        int a[] = {2,2,1,3,3,3,4,5};

        int ans[] = sort(a);

        for(int k : ans){
            System.out.print(k + " ");
        }
    }
}