public class Binary_Tree_Maximum_Path_Sum{
    static int max = Integer.MIN_VALUE;
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int max_sum(Node root){
        
        helper(root);

        return max;
    }

    public static int helper(Node root){
        if(root == null){
            return 0;
        }

        int left_sum = Math.max(0, helper(root.left));
        int right_sum = Math.max(0, helper(root.right));

        max = Math.max(max, left_sum + right_sum + root.data);

        return Math.max(left_sum, right_sum) + root.data;
    }

    public static void main(String[] args){

        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(0);
        root.right.right = new Node(1);

        System.out.println(max_sum(root));
    }
}
