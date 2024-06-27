

public class Merge_Sort {

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


        public void addMid(int data, int idx){
            if(idx==0){
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            Node temp = head;
            int i=0;
            while(i<idx-1){
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }


        public Node getMid(Node head){
            Node slow = head;
            Node fast = head.next;

            while(fast!=null && fast.next!=null){
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;

        }

        public Node mergeSort(Node head){

            if(head==null || head.next==null){
                return head;
            }

            Node mid = getMid(head);
            Node second = mid.next;
            mid.next = null;
            Node left = mergeSort(head);
            Node right = mergeSort(second);

            return merge(left,right);
        }

        public Node merge(Node left, Node right){

            Node temp = new Node(-1);
            Node curr = temp;

            while(left!=null && right!=null){

                if(left.data<=right.data){
                    curr.next = left;
                    left = left.next;
                    
                }
                else{
                    curr.next = right;
                    right = right.next;
                }
                curr = curr.next;

            }

            while(left!=null){
                curr.next = left;
                left = left.next;
                curr = curr.next;
            }

            while(right!=null){
                curr.next = right;
                right = right.next;
                curr = curr.next;
            }

            return temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(4);
        ll.print();
        ll.addFirst(5);
        ll.print();
        System.out.println("After Sorting");

        ll.head = ll.mergeSort(ll.head);
        ll.print();


    }
}
