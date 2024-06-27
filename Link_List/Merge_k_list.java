import java.util.*;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}

class Merge_k_list {

    public ListNode merge(ListNode left, ListNode right) {

        ListNode temp = new ListNode(-1);
        ListNode curr = temp;
        while (left != null && right != null) {
            if (left.val <= right.val) {
                curr.next = left;
                left = left.next;
            } else {
                curr.next = right;
                right = right.next;
            }
            curr = curr.next;
        }
        while (left != null) {
            curr.next = left;
            left = left.next;
            curr = curr.next;
        }

        while (right != null) {
            curr.next = right;
            right = right.next;
            curr = curr.next;
        }

        return temp.next;
    }

    public ListNode mergeKsort(ListNode[] list) {
        if (list.length == 0) {
            return null;
        }
        if (list.length == 1) {
            return list[0];
        }
        ListNode head = list[0];
        for (int i = 1; i < list.length; i++) {
            head = merge(head, list[i]);
        }
        
        return head;
    }

    public static void main(String[] args) {

        LinkedList<Integer>[] arr = new LinkedList[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new LinkedList<>();
        }

        arr[0].add(1);
        arr[0].add(8);
        arr[0].add(9);
        System.out.println(arr[0]);

        arr[1].add(4);
        arr[1].add(5);
        arr[1].add(6);
        System.out.println(arr[1]);

        arr[2].add(2);
        arr[2].add(3);
        arr[2].add(7);
        System.out.println(arr[2]);

        Merge_k_list merger = new Merge_k_list();
        ListNode[] listNodes = new ListNode[3];

        for (int i = 0; i < arr.length; i++) {
            listNodes[i] = new ListNode(arr[i].get(0));
            ListNode current = listNodes[i];
            for (int j = 1; j < arr[i].size(); j++) {
                current.next = new ListNode(arr[i].get(j));
                current = current.next;
            }
        }

        ListNode result = merger.mergeKsort(listNodes);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
