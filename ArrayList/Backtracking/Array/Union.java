import java.util.*;
public class Union{
    public static ArrayList<Integer> arr(int a[], int b[]){
        HashSet  <Integer> s = new HashSet<>();
        ArrayList <Integer> p = new ArrayList<>();
        for(int i=0;i<a.length;i++){
            s.add(a[i]);
        }
        for(int j=0;j<b.length;j++){
            s.add(b[j]);
        }

        for(int n : s){
            p.add(n);
        }
       return p;
    }
    public static void main(String[] args){
        int a[] = {1,2,3,4};
        int b[] = {4,5,6};
        ArrayList<Integer> c = arr(a,b);
        for(int n:c){
            System.out.print(n + " ");
        }
    }
}