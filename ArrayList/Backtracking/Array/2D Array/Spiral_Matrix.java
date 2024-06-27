import java.util.*;
public class Spiral_Matrix{
    public static void arr(int a[][]){
        int startrow = 0;
        int endrow = a.length-1;
        int startcol = 0;
        int endcol = a[0].length-1;
        while(startrow<=endrow && startcol<=endcol){
            //top
            for(int i=startcol;i<=endcol;i++){
                System.out.print(a[startrow][i] + " ");
            }
            //right
            for(int j=startrow+1;j<=endrow;j++){
                System.out.print(a[j][endcol] + " ");
            }
            //bottom
            for(int i=endcol-1;i>=startcol;i--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(a[endrow][i] + " ");
            }

            //left
            for(int j=endrow-1;j>=startrow+1;j--){
                if(startcol==endcol){
                    break;
                }
                System.out.print(a[j][startcol] + " ");
            }

            startrow++;
            endrow--;
            startcol++;
            endcol--;

        }
        System.out.println();
    }

    public static void main(String[] args){
        int a[][] = {{1,2,3,4},
                     {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}};
        arr(a);
    }
}