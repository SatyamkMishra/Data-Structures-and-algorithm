public class Stack_Implementation_using_LinkedList{
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack{

        static Node head = null;

        public boolean isEmpty(){
            return head==null;
        }

        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is already empty");
                return -1;
            }
            int var = head.data;
            head = head.next;
            return var;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
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