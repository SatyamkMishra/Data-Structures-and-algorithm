import java.util.*;

class Practise {
    
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
     public static class LinkedList{
         public Node head;
         public Node tail;
         
     
     
     public void addFirst(int val){
         Node newNode = new Node(val);
         
         if(head == null){
             head = tail = newNode;
             return;
         }
         newNode.next = head;
         head = newNode;
     }
     
     public void addLast(int val){
         Node newNode = new Node(val);
         
         if(head == null){
             head = tail = newNode;
             return;
         }
         tail.next = newNode;
         tail = newNode;
     }
     public void print(){
         if(head == null){
            System.out.println("Linked List is empty");
                return;
         }
         
         Node p = head;
         
         while(p != null){
             System.out.print(p.data + "-->");
             p = p.next;
         }
         System.out.println("null");
     }

     public void addMid(int val,int i){
        Node newNode = new Node(val);
        Node temp = head;
        int c = 0;
        while(c<i-1){
           temp = temp.next;
           c++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
     }

     public int removeFirst(){
        if(head == null){
            return 0;
        }
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(size==1){
            int val = head.data;
            head = tail = null;
            return val;
        }
        int c = head.data;
        head = head.next;
        return c;
     }

     public int removeLast(){
        if(head == null){
            return 0;
        }
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        if(size==1){
            int val = tail.data;
            head = tail = null;
            return val;
        }
    
        Node prev = head;
        for(int i=0;i<size-2;i++){
            prev = prev.next;
        }

        int val = tail.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
     }

     public int removeMid(int idx){
        if(head == null){
            return 0;
        }

        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        Node p = head;
        int i = 0;
        while(i<idx-1){
            p = p.next;
            i++;
        }
        int val = p.next.data;
        p.next = p.next.next;
        return val;
     }

     public void reverse(){
        Node curr = head;
        Node next;
        Node prev = null;

        while(curr != null){

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
     }

     public void remove_n(int n,int m){
        Node temp = head;

        while(temp != null){
            for(int i=0;i<m-1 && temp!=null;i++){
                temp = temp.next;
            }

            if(temp == null){
                return;
        
         }       
         Node curr = temp.next;
            for(int i=0;i<n && curr!= null;i++){
                curr = curr.next;
            }

            temp.next = curr;
          //  temp = curr;
        
     }
    }
     }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.addMid(4, 3);
        ll.print();
    //    ll.removeFirst();
    //     ll.print();
    //     ll.removeLast();
    //     ll.print();
    //     ll.removeMid(1);
    //     ll.print();
       // ll.reverse();
        ll.print();
        ll.remove_n(2, 2);
        ll.print();



    // LinkedList<Integer> ll = new LinkedList<>();
    // ll.addFirst(1);
    // ll.addLast(2);
    // ll.addLast(3);
    // ll.addLast(4);
    // ll.addLast(5);

    
    // System.out.println(ll);

      
    }
}