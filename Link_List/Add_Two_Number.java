public class Add_Two_Number{

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node add(Node head1 , Node head2){

        Node dummy = new Node(-1);
        Node curr = dummy;

        Node temp1 = head1;
        Node temp2 = head2;

        
        int carry = 0;

        while(temp1 != null || temp2 != null){

            int sum = 0 + carry;

            if(temp1 != null){
                sum += temp1.data;
                temp1 = temp1.next;
            }
            if(temp2 != null){
                sum += temp2.data;
                temp2 = temp2.next;
            }

            carry = sum / 10;
            int rem = sum%10;

            curr.next = new Node(rem);
            curr = curr.next;

        }
        if(carry>0){
            curr.next = new Node(carry);
        }

        return dummy.next;
    }
    
    public static void main(String[] args){


        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        // head.next.next.next = new Node(4);
        // head.next.next.next.next = new Node(5);


        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(9);


        Node temp = add(head,head2);

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}