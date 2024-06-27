import java.util.*;
class LinkedList_framework{
   
    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();
        System.out.println(ll);
        ll.addFirst(2);
        System.out.println(ll);
        ll.addFirst(1);
        System.out.println(ll);
        ll.addLast(3);
        System.out.println(ll);
        ll.addLast(4);
        System.out.println(ll);
        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
    }
}
