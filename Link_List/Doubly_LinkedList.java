public class Doubly_LinkedList {

    public static class Doubly_ll {
        static class Node {
            int data;
            Node next;
            Node prev;

            Node(int data) {
                this.data = data;
                this.next = null;
                this.prev = null;
            }
        }

        public Node head;
        public Node tail;
        public int size;
        public void addFirst(int data){
            Node newNode = new Node(data);
            if(size==0){
                head = tail = newNode;
                size++;
                return;
            }

            newNode.next = head;
            head.prev = newNode;
            size++;
            head = newNode;

        }

        public int removeFirst(){
            if(size==0){
                System.out.println("LinkedList is already empty");
                return Integer.MIN_VALUE;
            }

            if(size == 1){
                int data = head.data;
                head = tail = null;
                size = 0;
                return data;
            }

            int data = head.data;
            head = head.next;
            head.prev = null;
            size--;
            return data;
        }

        public void addLast(int data){
            Node newNode =new Node(data);
            if(size==0){
                head = tail = newNode;
                return;
            }

            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }

            temp.next = newNode;
            size++;
            newNode.prev = tail;
            tail = newNode;
        }

        public int removeLast(){
            if(size==0){
                System.out.println("LinkedList is already empty");
                return Integer.MIN_VALUE;
            }


            if(size == 1){
                int data = head.data;
                head = tail = null;
                size = 0;
                return data;
            }
            Node temp = head;
            while(temp.next.next != null){
                temp = temp.next;
            }

            
            int data = temp.next.data;
            size--;
            temp.next = null;
            tail = temp;
            return data;
        }

        public void print(){
            if(size==0){
                System.out.println("Linked List is empty ");
                return;
            }

            Node temp = head;
            while(temp !=  null){
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println("null");
        }


        public void reverse(){

            Node curr = head;
            Node prev = null;
            Node next;

            while(curr != null){
                next = curr.next;
                curr.next = prev;
                curr.prev = next;
                prev = curr;
                curr = next;
            }
            head = prev;

        }


    }

    public static void main(String[] args) {

        Doubly_ll db = new Doubly_ll();
        db.print();
        db.addFirst(2);
        db.print();
        db.addFirst(1);
        db.print();
        // db.removeFirst();
        // db.print();
        db.addLast(3);
        // db.print();
        // db.removeLast();
        db.print();
        db.reverse();
        db.print();

        System.out.println("Size of the LinkedList is " + db.size + " " );
       // db.print();
    }
}