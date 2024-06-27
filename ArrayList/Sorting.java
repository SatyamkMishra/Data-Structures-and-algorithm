import java.util.*;
class Sorting{
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(5);
        a.add(3);
        a.add(1);
        a.add(4);
//decennding order
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);

        Collections.sort(a,Collections.reverseOrder());
        System.out.println(a);
    }


}