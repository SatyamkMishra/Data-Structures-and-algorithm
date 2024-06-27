import java.util.*;
public class MAxSumOfArraySubPairs{
    public static void maxSumOfsubpairs(int a[]){
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(a[k]+ " ");
                    sum = sum+a[k];
                }
                System.out.println("Sum: " + sum);
                if(max<sum){
                    max = sum;
                }
            }
        }
        System.out.println("The maximum subarrays sum is: " + max);
    }

    public static void main(String[] args){
        int b[] = {1,2,3,4,5};
        maxSumOfsubpairs(b);

    }

}