class Linked_list_reverse{
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
            if(size==0){
                addFirst(data);
                return;
            }

            Node newNode = new Node(data);
            size++;
            int i=0;
            Node temp = head;

            while(i<index-1){
                temp = temp.next;
                i++;
            }

        
        newNode.next = temp.next;
        temp.next = newNode;

      }

      public int removeFirst(){
        if(size==0){
            System.out.println("Linked List is already Empty ");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;

      }

      public int removeLast(){
        if(size==0){
            System.out.println("Linked List is already Empty ");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int i=0;
        Node temp = head;
        while(i<size-2){
            temp = temp.next;
            i++;
        }
        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;

      }

      public void print(){

        if(head==null){
            System.out.println("Linked List is Empty ");
        }

        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");

      }


      public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        head = prev;
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
        // ll.removeFirst();
        // ll.print();
        // ll.removeLast();
        // ll.print();
        ll.reverse();
        ll.print();

    }
}