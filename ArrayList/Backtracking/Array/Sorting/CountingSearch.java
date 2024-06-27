import java.util.*;
public class CountingSearch{
    public static void array(int a[], int n) {
        // Write your code here.
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(min,a[i]);
        }
        for(int i=0;i<n;i++){
            if(a[i]>min && a[i]<smin){
                smin = a[i];
            }
        }
        System.out.println(smin); 
    }
public static void main(String[] args){
    int a[] = {4,7,2,1,6,5};
    array(a,6);
    
}
}