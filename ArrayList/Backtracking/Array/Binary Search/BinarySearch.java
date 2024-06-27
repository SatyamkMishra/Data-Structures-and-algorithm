import java.util.*;
public class BinarySearch{
    public static int BinaryS(int arr[] , int key){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = (start + end ) / 2;
        
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

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter the element that you want to search: ");
        int s = sc.nextInt();
        System.out.println("Enter the array element: ");
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        int index = BinaryS(marks,s);
        if(index == -1)
        System.out.println("Element does not found ");
        else
        System.out.println("Elment found at index: " + index);
    }
}