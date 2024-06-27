import java.util.ArrayList;

import javax.swing.tree.TreeNode;

public class BST_to_balanced_BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    public static void inOrder(Node root, ArrayList<Integer> a) {
        if (root == null) {
            return;
        }

        inOrder(root.left, a);
        a.add(root.data);
        inOrder(root.right, a);
    }

    public static Node sortedBst(ArrayList<Integer> a, int s, int e) {
        if (s > e) {
            return null;
        }

        int m = s + (e - s) / 2;

        Node root = new Node(a.get(m));
        root.left = sortedBst(a, s, m - 1);
        root.right = sortedBst(a, m + 1, e);

        return root;
    }

    public static void main(String[] args) {

        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3); 

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12); 
         
        ArrayList<Integer> a = new ArrayList<>();
        inOrder(root, a);
        root = sortedBst(a, 0, a.size() - 1);

        preOrder(root);
    }
}
