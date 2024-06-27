import java.util.ArrayList;

public class Size_largest_BST_in_BT {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    static class Info{
        boolean bst;
        int max;
        int min;
        int size;
        Info(boolean bst, int max, int min, int size){
            this.bst = bst;
            this.max = max;
            this.min = min;
            this.size = size;
        }
    }

    static int maxSize = 0;
    public static Info largestBst(Node root){
        if(root == null){
            return new Info(true, Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        }

        Info leftInfo = largestBst(root.left);
        Info rightInfo = largestBst(root.right);
        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.data, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.data, Math.max(leftInfo.max, rightInfo.max));

        if(root.data <= leftInfo.max || root.data >= rightInfo.min){
            return new Info(false, max, min, size);
        }

        if(leftInfo.bst && rightInfo.bst){
            maxSize = Math.max(maxSize,size);
            return new Info(true, max, min, size);
        }

        return new Info(false, max, min, size);
    }
    public static void main(String[] args) {

        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3); 

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12); 
         
     Info info = largestBst(root);
       System.out.println(maxSize);
    }
}
