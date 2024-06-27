import java.util.*;
public class PeakElementInMountain{
    public static int peakelement(int a[]){
        int start = 0;
        int end = a.length-1;
        while(start<end){
            int mid = (start + end) / 2;
            if(a[mid]<a[mid+1]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
        
    }
    public static void main(String[] args){
        int a[] = {2,3,4,5,5,5,1};
        int d = peakelement(a);
        System.out.println("The peak element is at index: " + d);
    }
}