import java.util.ArrayList;
class Basic{
    public static void main(String[] args){
        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        System.out.println(l1);

        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.get(2));


        l1.remove(2);
        System.out.println(l1);

        l1.set(1,5);
        System.out.println(l1);


        System.out.println(l1.contains(1));
        System.out.println(l1.contains(12));


        ArrayList<String> l2 = new ArrayList<>();
        l2.add("s");
        l2.add("a");
        l2.add("t");
        System.out.println(l2);
    }
}