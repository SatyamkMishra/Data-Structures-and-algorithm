//kadan theorem is used to find out max sum in all sub pairs using only only lopp


// import java.util.*;
// public class KadansTheoremMaxSumInSbPairs{
//     public static void max(int a[]){
//         int sum =0;
//         int max = Integer.MIN_VALUE;
//         for(int i=0;i<a.length;i++){
//             sum = sum + a[i];
//             if(sum>max){
//                 max = sum;
//             }
//             if(sum<0){
//                 sum = 0;
//             }
//         }
//         System.out.println("Maximum sum of subpairs is " + max);
//     }
//     public static void main(String[] args){
//         int b[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
//         max(b);
//     }
// }

import java.util.*;
public class KadansTheoremMaxSumInSbPairs{
    public static void max(int a[]){
        int sum =1;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            sum = sum * a[i];
            if(sum>max){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println("Maximum sum of subpairs is " + max);
    }
    public static void main(String[] args){
        int b[] = {1,2,-3,0,-4,-5};
        max(b);
    }
}