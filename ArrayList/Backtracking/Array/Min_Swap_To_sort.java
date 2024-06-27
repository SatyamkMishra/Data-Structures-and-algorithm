import java.util.*;
public class Min_Swap_To_sort{
    public static int sort(int a[]){

        int num[] = new int[a.length];

        for(int i=0;i<a.length;i++){
            num[i] = a[i];
        }

        Arrays.sort(num);

        HashMap<Integer,Integer> h = new HashMap<>();

        for(int i=0;i<a.length;i++){
            h.put(num[i],i);
        }


        int count = 0;
        int i=0;

        while(i<a.length){

            if(h.get(a[i])==i){
                i++;
            }else{
                int temp = a[h.get(a[i])];
                a[h.get(a[i])] = a[i];
                a[i] = temp;
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args){
        int a[] = {2,8,5,1};

        System.out.println(sort(a));
    }
}