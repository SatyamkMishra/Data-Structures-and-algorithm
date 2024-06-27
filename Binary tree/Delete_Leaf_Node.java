public class Delete_Leaf_Node {

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
    public static Node delete(Node root, int x){
        if(root == null){
            return root;
        }
        root.left = delete(root.left, x);
        root.right = delete(root.right, x);

       if(root.data == x && root.left == null && root.right == null){
        return null;
       }
       return root;
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(2);
        root.left.right = new Node(5);
        root.right.left = new Node(2);
        root.right.right = new Node(4);

        delete(root, 2);
        preOrder(root);
    }
}
