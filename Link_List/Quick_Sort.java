public class Quick_Sort{

    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node quickSort(Node head){

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        Node end = temp;

        quickSortUtil(head,end);

        return head;
    }

    public static void quickSortUtil(Node head, Node end){

        if(head == null || head.next == null || head == end){
            return;
        }


         Node pivot = partition(head,end);

        quickSortUtil(head, pivot);
        quickSortUtil(pivot.next, end);
    }

    public static Node partition(Node head, Node end){
        if(head == null || head.next == null || head == end){
            return head;
        }

        Node curr = head;
        Node prev = curr;
        int pivot = end.data;

        while(head != end){
            if(head.data<pivot){
                prev = curr;
                int temp = curr.data;
                curr.data = head.data;
                head.data = temp;
                curr = curr.next;
            }
            head = head.next;
        }

        int temp = curr.data;
        curr.data = pivot;
        end.data = temp;

        return prev;
    }

    public static void main(String[] args){

        Node head = new Node(3);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

       Node temp = quickSort(head);

        
            while (temp != null) {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
           
    }
}