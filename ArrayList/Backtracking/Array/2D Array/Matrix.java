import java.util.*;
public class Matrix{
    public static void arr(int row , int column){
         int a[][] = new int[row][column];
        Scanner sc = new Scanner(System.in);
        System.out.println("Array length is " + a.length + " " + a[0].length);
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.println("Enter " + i + " " + j + " element");
                a[i][j] = sc.nextInt();
            }
        }
         System.out.println("Your Array is ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
    }
public static void main(String[] args){
   arr(3,2);
}
}