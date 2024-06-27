import java.util.*;
public class Iteration {
    public static void main(String[] args){

        HashSet<String> set = new HashSet<>();

        set.add("Delhi");
        set.add("Bangluru");
        set.add("Noida");
        set.add("Patna");

        System.out.println(set);

        for(String city : set){
            System.out.println(city);
        }

        System.out.println("Using Iterator ");
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
