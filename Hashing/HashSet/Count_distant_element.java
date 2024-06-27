import java.util.*;
public class Count_distant_element {
    public static void main(String[] args){
        int a[] = {1,2,1,1,2,1,0,1,0,2,1,2,0,1,0};

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }

        System.out.println("Number of distint element in this array is " + set.size());
    }
}
