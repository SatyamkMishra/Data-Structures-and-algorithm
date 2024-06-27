import java.util.*;
class Print_Hashmap{
    public static void main(String[] args){
        HashMap<String, Integer> h = new HashMap<>();

        h.put("Satyam",1);
        h.put("Shivam",2);
        h.put("Shubham",3);

        System.out.println(h);

        System.out.println(h.get("Satyam"));

        System.out.println(h.containsKey("Shubham"));

        System.out.println(h.containsValue(6));

        h.remove("Shivam");
        System.out.println(h);

        System.out.println(h.isEmpty());

        h.clear();
        System.out.println(h);
        System.out.println(h.isEmpty());

    }
}