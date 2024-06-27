import java.util.*;
public class SumOfSubPairs{
    public static void sumofsubpairs(int a[]){
        int sum = 0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                 sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(a[k] + " ");
                    sum = sum + a[k];
                }
                System.out.println("Sum = " + sum);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args){
        int b[] = {1,2,3,4};
        sumofsubpairs(b);
    }
}