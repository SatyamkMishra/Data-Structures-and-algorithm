import java.util.*;
public class SelectionSort{
    public static void selection(int a[]){
        int n = a.length;
        for(int i=0;i<n-1;i++){
            int min_index = i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min_index])
                  min_index = j;

                int temp = a[min_index];
                a[min_index] = a[i];
                a[i] = temp;
            }
        }
    }
    public static void array(int a[]){
        int n = a.length;
        for(int i=0;i<n;i++){
            System.out.print(a[i] + " ");
        }
    }
    public static void main(String[] args){
        int a[] = {5,3,1,4,2};
        selection(a);
        array(a);
    }
}