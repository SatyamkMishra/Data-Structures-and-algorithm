public class Zig_zag_List {

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

        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;
        }

        public void addLast(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;
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

        public void addMid(int data, int idx) {
            if (idx == 0) {
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            Node temp = head;
            int i = 0;
            while (i < idx - 1) {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

        public Node getMid(Node head) {
            Node slow = head;
            Node fast = head.next;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;

        }

        public Node reverse(Node head) {
            Node prev = null;
            Node curr = head;
            Node next;

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;

            }

            return prev;
        }

        public void zig() {

            Node mid = getMid(head);

            Node curr = mid.next;
            mid.next = null;
            Node prev = null;
            Node next;

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            Node first = head;
            Node second = prev;

            Node nextFirst;
            Node nextSecond;
            while(first != null && second != null){

                nextFirst = first.next;
                first.next = second;
                nextSecond = second.next;
                second.next = nextFirst;

               first = nextFirst;
               second = nextSecond;

            }

        }
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(5);
        ll.print();
        ll.addFirst(4);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();

        ll.zig();
        ll.print();
    }
}