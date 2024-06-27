class Linkedlist_size{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
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
            tail = newNode;
        }

        public void addMid(int data, int index){
            if(index==0){
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            int i = 0;
            Node temp = head;
            while(i<index-1){
                temp = temp.next;
                i++;
            }

            newNode.next = temp.next;
            temp.next = newNode;
        }

        public void print(){
            if(head==null){
                System.out.println("Linked List is Empty ");
                return;
            }

            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data +"-->");
                temp=temp.next;
            }
            System.out.print("null");
            System.out.println();
        }
    }

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(3);
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.addMid(4,3);
        ll.print();
        System.out.println(ll.size);
    }
}