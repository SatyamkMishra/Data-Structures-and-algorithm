import java.util.*;

public class Treemap {
    public static void main(String[] args){
        TreeMap<String,Integer> t = new TreeMap<>();
        t.put("Shubham",3);
        t.put("Satyam",1);
        t.put("Shivam",2);
        

        System.out.println(t);


        TreeMap<Integer,Integer> t1 = new TreeMap<>();
        t1.put(3,1);
        t1.put(5,2);
        t1.put(4,3);

        System.out.println(t1);
    }
}
