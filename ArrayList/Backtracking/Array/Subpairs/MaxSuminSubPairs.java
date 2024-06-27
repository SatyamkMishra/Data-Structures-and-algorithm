import java.util.*;
public class MaxSuminSubPairs{
    public static void max(int a[]){
    int sum =0;
    int max = Integer.MIN_VALUE;
    for(int i=0;i<a.length;i++){
        for(int j=i;j<a.length;j++){
            sum=0;
            for(int k=i;k<=j;k++){
                System.out.print(a[k] + " ");
                sum = sum + a[k];
            }
            System.out.println("Sum = " + sum);
            if(sum>max){
                max=sum;
            }
        }
        System.out.println();
    }
    System.out.println("Max of sum pairs is " + max);
}
    public static void main(String[] args){
        int b[] = {1,2,3,5};
        max(b);
    }
}