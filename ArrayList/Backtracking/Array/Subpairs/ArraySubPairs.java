import java.util.*;
public class ArraySubPairs{
    public static void subpairs(int a[]){
        int count = 0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(a[k] + " ");
                }
                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("The total number of subpairs is: " + count);
    }
    public static void main(String[] args){
        int a[] = {1,2,3,4};
        subpairs(a);
    }
}