import java.util.*;
public class Seraching_sorted_array{
    public static boolean arr(int a[][],int key){
        int row = 0;
        int column = a[0].length-1;
        while(row<a.length && column>=0){
            if(a[row][column]==key){
                System.out.println("Found at (" + row + "," + column + ") position");
                return true;
            }
            else if(key<a[row][column]){
                column--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args){
        int a[][] = {{10,20,30,40},
                     {15,25,35,45},
                     {27,29,37,48},
                     {32,33,39,50}};
        arr(a,29);
    }
}