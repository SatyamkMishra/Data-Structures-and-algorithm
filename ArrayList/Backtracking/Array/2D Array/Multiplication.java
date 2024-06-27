import java.util.*;
public class Multiplication{
    public static void arr(int a[][] , int b[][]){
        int r[][] = new int[a.length][b[0].length];
        for(int i=0;i<r.length;i++){
            for(int j=0;j<r[0].length;j++){
                int sum = 0;
                for(int k=0;k<a[0].length;k++){
                    sum+=a[i][k]*b[k][j];
                }
                r[i][j]=sum;
                System.out.print(r[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int a[][] = {{1,1,1},
                     {2,2,2},
                     {3,3,3}};
        int b[][] = {{1,1,1},
                     {2,2,2},
                     {3,3,3}};
        arr(a,b);
    }
}