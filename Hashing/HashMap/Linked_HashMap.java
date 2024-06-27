import java.util.*;
public class Linked_HashMap {
    public static void main(String[] args){
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("Satyam",1);
        lhm.put("Sat",2);
        lhm.put("yam",3);
        lhm.put("aty",4);

        System.out.println(lhm);


        // HashMap<String, Integer> h = new HashMap<>();
        // h.put("Satyam",1);
        // h.put("Sat",2);
        // h.put("yam",3);
        // h.put("aty",4);

        // System.out.println(h);

        System.out.println(lhm.get("Sat"));
        lhm.remove("yam");
        System.out.println(lhm);

        System.out.println(lhm.containsKey("yam"));
        System.out.println(lhm.containsValue(2));
    }
}
