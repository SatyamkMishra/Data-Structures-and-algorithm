import java.util.*;
class Queue_implementation_using_jcf{
    public static void main(String[] args){
       // Queue<Integer> q = new LinkedList<>();

        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.remove();
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}