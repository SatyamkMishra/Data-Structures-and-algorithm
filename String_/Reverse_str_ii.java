import java.util.*;
public class Reverse_str_ii{
    public static void reverse(char c[] , int i, int j){
        while(i<j){
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
    }
    public static String revstr(String s, int k){
        char c[] = s.toCharArray();
        int i=0;
        int n = c.length;
        while(i<n){
            int j = Math.min(i+k-1,n-1);
            reverse(c,i,j);
            i=i+2*k;

        }
        return new String(c);
    }
public static void main(String[] args){
    String s ="abcdefgh";
    int k = 2;
    System.out.println(revstr(s,k));
}
}