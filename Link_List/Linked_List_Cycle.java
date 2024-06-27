

public class Linked_List_Cycle {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        public Node head;
        public Node tail;

        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public void print() {
            if (head == null) {
                System.out.println("Linked List is empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public boolean hasCycle(Node head) {

            if(head==null){
                return false;
            }
             Node slow = head;
             Node fast = head;
    
            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
                if(slow==fast){
                    return true;
                }
            }
            return false;
        }

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.add(2);
        ll.print();
        ll.add(1);
        ll.print();
        ll.add(0);
        ll.print();
        ll.head.next.next.next = ll.head;
        System.out.println(ll.hasCycle(ll.head));


    }
}
