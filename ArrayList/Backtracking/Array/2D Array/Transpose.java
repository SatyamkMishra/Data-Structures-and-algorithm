import java.util.*;
public class Transpose{
    public static void arr(int a[][]){
        int t[][] = new int[a[0].length][a.length];

        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                t[i][j] = a[j][i];
            }
        }

        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    } 
    public static void main(String[] args){
        int a[][] = {{1,2},
                     {4,5}};
        arr(a);
    }
}