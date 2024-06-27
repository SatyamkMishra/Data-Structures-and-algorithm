public class Left_Rotate {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // public static Node reverse(Node head) {
    //     Node prev = null;
    //     Node curr = head;
    //     Node next;

    //     while (curr != null) {
    //         next = curr.next;
    //         curr.next = prev;
    //         prev = curr;
    //         curr = next;
    //     }

    //     return prev;
    // }

    public static Node rotate(Node head, int k) {

        if (k == 0 || head == null || head.next == null) {
            return head;
        }
        Node temp = head;

        for (int i = 0; i < k && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            return head;
        }

        Node t = new Node(-1);
        Node curr = t;

        Node kNode = temp;

        while (kNode != null) {
            curr.next = new Node(kNode.data);
            curr = curr.next;
            kNode = kNode.next;
        }

        temp = head;

        for (int i = 0; i < k && temp != null; i++) {
            curr.next = new Node(temp.data);
            curr = curr.next;
            temp = temp.next;
        }
        return t.next;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        // head.next.next.next.next.next = new Node(6);


        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
        Node c = rotate(head, 3);
        temp = c;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

    }
}