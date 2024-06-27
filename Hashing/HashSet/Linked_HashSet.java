import java.util.LinkedHashSet;

public class Linked_HashSet {
    public static void main(String[] args){
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Bangluru");
        lhs.add("Noida");
        lhs.add("Patna");

        System.out.println(lhs);

        System.out.println(lhs.isEmpty());

        lhs.clear();
        System.out.println(lhs.isEmpty());
    }
}
