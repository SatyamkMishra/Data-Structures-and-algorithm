
public class Swap {

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

        public void swap(int index1, int index2) {
            if (index1 == index2) {
                return;
            }

            Node temp1 = head;
            Node prev1 = null;
            for (int i = 0; i < index1 - 1 && temp1 != null; i++) {
                prev1 = temp1;
                temp1 = temp1.next;
            }

            Node temp2 = head;
            Node prev2 = null;
            for (int j = 0; j < index2 - 1 && temp2 != null; j++) {
                prev2 = temp2;
                temp2 = temp2.next;
            }

            if (temp1 == null || temp2 == null) {
                return;
            }

            if (prev1 != null) {
                prev1.next = temp2;
            } else {
                head = temp2;
            }

            if (prev2 != null) {
                prev2.next = temp1;
            } else {
                head = temp1;
            }
            Node temp = temp1.next;
            temp1.next =temp2.next;
            temp2.next = temp;

            if (temp1.next == null) {
                tail = temp1;
            } else if (temp2.next == null) {
                tail = temp2;
            }

        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(0);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addMid(5, 2);
        ll.print();
       ll.swap(3,4);
        ll.print();

    }
}
