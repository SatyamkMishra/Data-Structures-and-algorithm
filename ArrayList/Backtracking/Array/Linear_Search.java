import java.util.*;
public class Linear_Search{
    public static int LinearSearch(int marks[], int s){
        for(int i=0;i<marks.length;i++){
            if(marks[i]==s){
                return i;
            }
        }
        return -1;    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the searching element: ");
        int s = sc.nextInt();
        System.out.println("Enter the array element: ");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int index = LinearSearch(a,s);
        if(index==-1)
        System.out.println("Element not found ");
        else
        System.out.println("Element found at index " + index);
    }
}