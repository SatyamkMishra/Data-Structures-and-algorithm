import java.util.*;
public class Reverse{
    public static void reverse(int arr[]){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start ++;
            end --;
        }
    }
    public static void main(String[] args){
        int a[] = {1,6,4,7,3,8};
        reverse(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        System.out.println();
    }
}