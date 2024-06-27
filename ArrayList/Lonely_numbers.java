
import java.util.*;
class Lonely_numbers {
    public static void n(int a[]){
        ArrayList<Integer> an =  new ArrayList<>();
        Arrays.sort(a);
        for(int i=1;i<a.length-1;i++){
            if(a[i-1]+1<a[i] && a[i]+1<a[i+1]){
                an.add(a[i]);
            }
        }
        if(a.length==1){
            an.add(a[0]);
        }
        if(a.length>1){
            if(a[0]+1<a[1]){
                an.add(a[0]);
            }
        }
        
        if(a[a.length-2]+1<a[a.length-1]){
            an.add(a[a.length-1]);
        }
        System.out.println(an);
    }
    public static void main(String[] args) {
        int a[] = {10,6,5,8};
        n(a);
        //System.out.println(n(a));
    }
}