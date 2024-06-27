class Doubly_ll{
    public static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static class LinkedList{
        public Node head;
        public Node tail;
        public int size;

        public void addFirst(int data){
            Node newNode = new Node(data);
            size++;
            if(head==null){
                head = tail = newNode;
                return;
            }
            head.prev = newNode;
            newNode.next = head;
            head = newNode;

        }

        public void addLast(int data){
            Node newNode = new Node(data);
            size++;
            if(head==null){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        public int removeFirst(){
            if(head==null){
                System.out.println("LinkedList is already empty");
                return Integer.MIN_VALUE;
            }

            if(size==1){
                head = tail = null;
                size=0;
                return Integer.MIN_VALUE;
            }
           int var = head.data;
           size--;
           head = head.next;
           head.prev = null;
           return var;

        }

        public int removeLast(){

            if(head==null){
                System.out.println("LinkedList is already empty");
                return Integer.MIN_VALUE;
            }

            if(size==1){
                head = tail = null;
                size=0;
                return Integer.MIN_VALUE;
            }
            int k = 0; 
            int var = tail.data;
            Node temp = head;
            while(k<size-2){
                temp = temp.next;
                k++;
            }

            tail = temp;
            tail.next = null;
            size--;
            return var;
        }
        public void print(){
            if(head==null){
                System.out.println("Linked is Empty");
                return;
            }
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data + " --> ");
                temp  = temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        System.out.println(ll.size);
    }
}