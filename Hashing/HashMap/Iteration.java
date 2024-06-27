import java.util.*;
public class Iteration {
    public static void main(String[] args){
        HashMap<String,Integer> h = new HashMap<>();
        h.put("Satyam",1);
        h.put("Sat",2);
        h.put("yam",3);
        h.put("aty",4);

        Set<String> keys = h.keySet();
        System.out.println(keys);

        for(String s : keys){
            System.out.println("Key = " + s + ", Value = " + h.get(s));
        }
    }
}
