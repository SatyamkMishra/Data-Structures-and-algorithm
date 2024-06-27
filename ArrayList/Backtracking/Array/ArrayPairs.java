import java.util.*;
public class ArrayPairs{
    public static void pairs(int a[]){
        int count = 0;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                System.out.print("(" + a[i] + "," + a[j] + ")" + " ");
                count++;
            }
            System.out.println();
        }
        System.out.println("The total number of pairs is: " + count);
    }

    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6};
        pairs(a);
    }

}