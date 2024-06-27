

public class Odd_Even {

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

        public void oddEven() {
            if (head == null) {
                System.out.println("Linked List is empty");
                return;
            }
        
            Node curr = head;
            Node oddhead = null;
            Node oddtail = null;
            Node evenhead = null;
            Node eventail = null;

            while(curr!=null){
                Node newNode = new Node(curr.data);

                if(curr.data%2!=0){
                    if(oddhead==null){
                        oddhead = oddtail = newNode;
                    }
                    else{
                        oddtail.next = newNode;
                        oddtail = newNode;
                    }
                }
                else{
                    if(evenhead==null){
                        evenhead = eventail = newNode;
                    }
                    else{
                        eventail.next = newNode;
                        eventail = newNode;
                    }
                }
                curr = curr.next;
            }

            if(oddhead !=null){
                tail = oddtail;
                head = oddhead;
                
                tail.next = evenhead;
            }
            else{
                head = evenhead;
                tail = eventail;
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
        ll.addLast(5);
        ll.print();
        ll.addLast(6);
        ll.print();
        ll.oddEven();
        ll.print();


    }
}
