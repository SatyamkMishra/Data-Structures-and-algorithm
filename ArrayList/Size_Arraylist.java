import java.util.*;
class Size_Arraylist{
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=1;i<=5;i++){
            a.add(i);
        }

        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i) + " ");
        }
        System.out.println(a);
        // Print Reverse

        for(int i=a.size()-1;i>=0;i--){
            System.out.print(a.get(i) + " ");
        }
    }
}