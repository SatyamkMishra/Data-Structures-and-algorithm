import java.util.ArrayList;

public class Stack_Implementation_using_ArrayList {

    public static class Stack {
        public ArrayList<Integer> a = new ArrayList<>();

        public boolean isEmpty() {
            return a.size() == 0;
        }

        public void push(int data) {
            a.add(data);
        }

        public int pop() {
            if(isEmpty()){
                System.out.println("Stack is empty ");
                return -1;
            }
            int top = a.get(a.size() - 1);
            a.remove(a.size() - 1);
            return top;
        }

        public int peek() {
            if(isEmpty()){
                System.out.println("Stack is empty ");
                return -1;
            }
            return a.get(a.size() - 1);
        }

        // public void print() {
        //     while (!isEmpty()) {
        //         System.out.println(peek());
        //         pop();
        //     }
        // }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(3);
        s.push(2);
        s.push(1);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}
