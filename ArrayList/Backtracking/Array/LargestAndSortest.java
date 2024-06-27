import java.util.*;
public class LargestAndSortest{
    public static int Lar(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    public static int Sml(int arr[]){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        return min;
    }
     
    public static void main(String[] args){
        int marks[]={1,2,3,4};
        int max = Lar(marks);
        int min = Sml(marks);
        System.out.println("The largest number in the array is " + max);
        System.out.println("The smallest number in the array is " + min);

    }
}