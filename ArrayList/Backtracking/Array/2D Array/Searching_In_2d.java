import java.util.*;
public class Searching_In_2d{
    public static boolean arr(int row, int column, int key){
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[row][column];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.println("Enter " + i + " " + j + " elemnt");
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==key){
                    System.out.println("Element found at " + i + " " + j);
                    return true;
                }
            }
        }
        System.out.println("Not found at any position ");
        return false;
    }
    public static void main(String[] args){
        arr(2,3,5);
    }
}