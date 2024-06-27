import java.util.*;
public class Union_intersection {
    public static void main(String[] args){
        int a[] = {1,2,3,4,5,6};
        int b[] = {4,5,6,7,8,9};

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }

        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }

        System.out.println(set + " Size = " + set.size());

        set.clear();
    
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }

        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<b.length;i++){
            if(set.contains(b[i])){
                set.remove(b[i]);
                ar.add(b[i]);
            }
        }

        System.out.println(ar + " Size = " + ar.size());
    }
}
