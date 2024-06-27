import java.util.*;
public class Lrgest_SubArray_sum_0 {
    public static void main(String[] args){

        int a[] = {15,-2,2,-8,1,7,10};
        HashMap<Integer,Integer> h = new HashMap<>();

        int sum = 0;
        int len = 0;

        for(int i=0;i<a.length;i++){
             sum += a[i];

             if(h.containsKey(sum)){
                len = Math.max(len,i-h.get(sum));
             }
             else{
                h.put(sum,i);
             }
        }

        System.out.println("Max length of subArray with sum 0 id " + len);
    }
}
