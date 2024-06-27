public class Move_Last_Element_in_first{

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    public static Node r(Node head){

        Node temp = head;
        Node c = null;
        while(temp.next.next != null){
            temp = temp.next;
        }

        c = temp.next;
        temp.next = null;
        c.next = head;

        return c;

    }
    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);


        Node temp = r(head);

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}