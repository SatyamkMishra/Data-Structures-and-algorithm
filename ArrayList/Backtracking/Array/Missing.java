import java.util.*;
public class Missing{
    public static int arr(int a[], int index){
        int start = 0;
        int end = a.length-1;
        int mid = 0;
        while(start<=end){
            mid = (start+end)/2;
            int miss = a[mid] - (mid+1);
            if(miss<index){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return (index+end+1);
    }
    public static void main(String[] args){
        int a[] = {4,7,9,10,11};
        System.out.println(arr(a,4));
    }
}