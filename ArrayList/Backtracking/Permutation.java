import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void permutation(int a[],List<List<Integer>> l, List<Integer> list){

        if(list.size()==a.length){
            l.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<a.length;i++){
            if(list.contains(a[i])){
                continue;
            }else{
                list.add(a[i]);
                permutation(a, l, list);
                list.remove(list.size()-1);
            }
        }
    }
    public static void main(String[] args){
        int a[] = { 1, 2, 3};
        List<List<Integer>> l = new ArrayList<>();
        permutation(a,l,new ArrayList<>());
        System.out.println(l);
    }
}
