import java.util.*;
class Maximum_element{
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=1;i<=5;i++){
            a.add(i);
        }

        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i) + " ");
        }
        System.out.println(a);
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<a.size();i++){
            max = Math.max(max,a.get(i));
        }

        System.out.println("Max element in arraylist is " + max);

        
    }
}