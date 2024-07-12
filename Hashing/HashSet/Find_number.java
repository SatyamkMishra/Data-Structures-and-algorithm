//find the number which present in second array but not in the first array

import java.util.*;
class Find_number {
    
    public static void find(int a[], int b[]){
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        
        for(int i : a){
            h1.add(i);
        }
        
        for(int i : b){
            h2.add(i);
        }
        
        for(Integer t : h1){
            if(h2.contains(t)){
                h2.remove(t);
            }
        }
        
        for(int p : h2){
            System.out.print(p + " ");
        }
    }
    public static void main(String[] args) {
       int a[] = {1,1,2,2,3,4,1,5};
       
       int b[] = {1,2,3,4,5,6,7,8,9,0};
       
       find(a,b);
    }
}