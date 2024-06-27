import java.util.*;
public class Majority_element {
    public static void main(String[] args){

        int a[] = {1,3,2,5,1,3,1,5,1};

        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0;i<a.length;i++){
            if(h.containsKey(a[i])){
                h.put(a[i], h.get(a[i]) + 1);
            }
            else{
                h.put(a[i],1);
            }
        }
        
        for(Integer k : h.keySet()){
            if(h.get(k) > a.length/3){
                System.out.println(k);
            }
        }
    }
}
