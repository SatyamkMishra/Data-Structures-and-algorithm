import java.util.*;
public class Sum{
    public static void arr(int a[][] ,int b[][]){
        int c[][] = new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int a[][] = {{1,2,3},
                     {4,5,6}};
        int b[][] = {{1,2,3},
                     {4,5,6}};
        arr(a,b);
    }
}