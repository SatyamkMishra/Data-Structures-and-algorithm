import java.util.*;
public class BuyAndSell{
    public static void profit(int a[]){
        int buying = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i=0;i<a.length;i++){
            if(buying<a[i]){
                int profit = a[i] - buying;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                 buying = a[i];
            }
        }
        System.out.println("Max profit is " + maxprofit);
    }
    public static void main(String[] args){
        int a[] = {7,6,5,1,2,5,2};
        profit(a);
    }
}