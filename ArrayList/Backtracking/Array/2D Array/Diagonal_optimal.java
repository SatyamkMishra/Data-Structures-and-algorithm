import java.util.*;
public class Diagonal_optimal{
    public static int arr(int a[][]){
        int sum = 0;

        for(int i=0;i<a.length;i++){
            sum += a[i][i];
           /*We knoe that i+j=a.length-1
           so here j = a.length-1-i;
           */
            if(i+a.length-1-i==a.length-1){
                if(i!=a.length-1-i){
                sum+=a[i][i];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int a[][] = {{1,2,3,4},
                     {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};

        int b[][] = {{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        System.out.println(arr(a));
        System.out.println(arr(b));
    }
}