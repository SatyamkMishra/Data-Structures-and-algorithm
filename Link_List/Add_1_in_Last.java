public class Add_1_in_Last{

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }

        return prev;
    }

    public static Node add(Node head){

        

        Node temp = reverse(head);
        Node curr = temp;
        int carry = 1;
        while(curr != null){

            curr.data = curr.data + carry;
            if(curr.data < 10){
                carry = 0;
                break;
            }else{
                curr.data = 0;
                carry = 1;
            }
           curr = curr.next;
        }

        if(carry == 1){
            Node newNode = new Node(carry);
            temp = reverse(temp);
            newNode.next = temp;
            return newNode;
        }

        return reverse(temp);
    }
    public static void main(String[] args){


        Node head = new Node(9);
        // head.next = new Node(0);
        // head.next.next = new Node(9);

        Node temp = add(head);

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}