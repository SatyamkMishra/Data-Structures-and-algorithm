import java.util.*;
public class PrefixSum{
    public static void sum(int a[]){
        int sum=0;
        int max = Integer.MIN_VALUE;
        int prefix[] = new int[a.length];
        prefix[0] = a[0];
        for(int k=1;k<prefix.length;k++){
            prefix[k] = prefix[k-1] + a[k];
        }

        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                if(i==0){
                    sum = prefix[j];
                }
                else{
                    sum =  prefix[j] - prefix[i-1];
                }

                if(max<sum){
                    max=sum;
                }
            }
        }
        System.out.println("MAX SUM IS "+ max);
    }

    public static void main(String[] args){
        int b[] = {1,-2,6,-1,3};
        sum(b);
    }
}