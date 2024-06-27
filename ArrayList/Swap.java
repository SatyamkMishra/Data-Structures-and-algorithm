import java.util.*;
class Swap{
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=1;i<=5;i++){
            a.add(i);
        }


        int m = a.get(0);
        int n = a.get(4);

        a.set(0,n);
        a.set(4,m);
                
                
                

        System.out.println(a);

    }
}