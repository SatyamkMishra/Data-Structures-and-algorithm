import java.util.*;
public class RoatedSortedArray{
    public static int pivot(int a[]){
        int start = 0;
        int end = a.length-1;
        while(start<end){
           int mid = start + (end - start ) / 2;
           if(mid>0 && a[mid]<a[mid-1]){
            return mid;
           }
           else if(a[mid]>=a[start] && a[mid]>a[end]){
                start=mid+1;
            }

            else{
                end = mid-1;
            }
        }
        return start;
    }

    public static int binaryS(int arr[] ,int s,int e, int key){
        int start = s;
        int end = e;
        while(start<=end){
            int mid = start + (end - start ) / 2;
        
        if(arr[mid]==key){
            return mid;
        }
       if(arr[mid]<key){
            start =  mid+1;
        }
        else{
            end = mid-1;
        }
    }
        return -1;
    }





    public static int index(int a[],int key){
        int p = pivot(a);
        if(key>=a[p] && key<=a[a.length-1]){
            return binaryS(a,p,a.length-1,key);
        }
        else{
            return binaryS(a,0,p,key);
        }
    }
    public static void main(String[] args){
        int a[] = {7,9,1,2,3};
        int k = 3;
        System.out.println(index(a,k));
    }
}
