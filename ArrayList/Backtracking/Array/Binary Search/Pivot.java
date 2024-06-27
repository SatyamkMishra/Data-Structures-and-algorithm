import java.util.*;
public class Pivot{
    public static int pivot(int a[]){
        int start = 0;
        int end = a.length-1;
        int mid = 0;
        while(start<end){
            mid = (start+end)/2;
            if(a[mid]>=a[0]){
                start=mid+1;
            }

            else{
                end = mid;
            }
        }
        return start;
    }
    public static void main(String[] args){
        int a[] ={7,8,1,2,3};
        System.out.println(pivot(a));
    }
}