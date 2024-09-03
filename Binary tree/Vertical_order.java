import java.util.*;

public class Vertical_order {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info {
        Node node;
        int hd;

        Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void verticalOrder(Node root) {

        Queue<Info> q = new LinkedList<>();
        TreeMap<Integer, ArrayList<Integer>> h = new TreeMap<>();

        q.offer(new Info(root, 0));

        while (!q.isEmpty()) {
            Info curr = q.poll();

            if (h.containsKey(curr.hd)) {
                h.get(curr.hd).add(curr.node.data);
            } else {
                h.put(curr.hd, new ArrayList<>(Arrays.asList(curr.node.data)));
            }

            if (curr.node.left != null) {
                q.offer(new Info(curr.node.left, curr.hd - 1));
            }

            if (curr.node.right != null) {
                q.offer(new Info(curr.node.right, curr.hd + 1));
            }
        }

        for(Integer i : h.keySet()){
            ArrayList<Integer> a = h.get(i);
            for(Integer j : a){
                System.out.print(j + " ");
            }
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        verticalOrder(root);

    }
}
