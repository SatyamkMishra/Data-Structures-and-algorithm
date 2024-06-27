import java.util.*;
class Contsiner_water{

    public static int n(ArrayList<Integer> a){
        int l = 0;
        int r = a.size()-1;
        
        
        int max= 0;
        
        while(l<r){
            int left = a.get(l);
            int right = a.get(r);
            int c = r-l;
            int d=  Math.min(left,right);
            int e = c*d;
            max = Math.max(max,e);
            if(left>=right){
                r--;
            
            }
            else{
                l++;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(8);
        a.add(6);
        a.add(2);
        a.add(5);
        a.add(4);
        a.add(8);
        a.add(3);
        a.add(7);
        System.out.println(n(a));
    }
}
