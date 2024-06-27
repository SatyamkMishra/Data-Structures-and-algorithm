import java.util.*;

public class Find_iteraniary_tickets {

    public static String getFirst(HashMap<String,String> h){
        HashMap<String, String> revH = new HashMap<>();

        for(String k : h.keySet()){
            revH.put(h.get(k),k);
        }

        for(String k : h.keySet()){
            if(!revH.containsKey(k)){
                return k;
            }
        }
       return "";
    }

    public static List journey(HashMap<String, String> h){
        String first = getFirst(h);

        List<String> l = new ArrayList<>();

        l.add(first);
        for(String k :  h.keySet()){
            l.add(h.get(first));
            first = h.get(first);
        }

        return l;
    }
    public static void main(String[] args) {

        List<List<String>> l = new ArrayList<>();

        List<String> list1 = new ArrayList<>();
        list1.add("MUC");
        list1.add("LHR");
        l.add(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("JFK");
        list2.add("MUC");
        l.add(list2);

        List<String> list3 = new ArrayList<>();
        list3.add("SFO");
        list3.add("SJC");
        l.add(list3);

        List<String> list4 = new ArrayList<>();
        list4.add("LHR");
        list4.add("SFO");
        l.add(list4);
        System.out.println(l);
        System.out.println(l.get(0).get(0));

        HashMap<String, String> h  = new HashMap<>();

        for(int i=0;i<l.size();i++){
            h.put(l.get(i).get(0),l.get(i).get(1));
        }
        System.out.println(h);

        List<String> l2 = journey(h);

        System.out.println(l2);

        

    }
}
