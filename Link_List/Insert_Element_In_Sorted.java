public class Insert_Element_In_Sorted{

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    public static Node add(Node head, int k){
        Node temp = head;
        Node prev = head;

        Node newNode = new Node(k);

        if(head.data>=k){
            newNode.next = head;
            return newNode;
        }
        while(temp != null && temp.data<k){
            prev = temp;
            temp = temp.next;
        }

        prev.next = newNode;
        newNode.next = temp;

        return head;
    }
    public static void main(String[] args){


        Node head = new Node(1);
        head.next = new Node(2);
      //  head.next.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);


        Node temp = add(head,2);

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}