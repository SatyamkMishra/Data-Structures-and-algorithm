import java.util.*;
public class Duplicate1{
    public static boolean duplicate(int a[]){
        int n = a.length-1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n+1;j++){
                if(a[i]==a[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        int b[] = {1,2,3,1};
        System.out.println(duplicate(b));
    }
}