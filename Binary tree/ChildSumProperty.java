public class ChildSumProperty {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void arrange(Node root){

        if(root==null){
            return;
        }

        int child = 0;

        if(root.left != null){
            child += root.left.data;
        }
        if(root.right != null){
            child += root.right.data;
        }

        if(child>=root.data){
            root.data = child;
        }else{
            if(root.left != null && root.right != null){
                root.left.data = root.data;
                root.right.data = root.data;
            }else if(root.left != null){
                root.left.data = root.data;
            }else if(root.right != null){
                root.right.data = root.data;
            }
        }

        arrange(root.left);
        arrange(root.right);

        int total = 0;
        if(root.left != null){
            total += root.left.data;
        }
        if(root.right != null){
            total += root.right.data;
        }
        if(root.left != null || root.right != null){
            root.data = total;
        }
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(7);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(5);
        root.right.left = new Node(1);
        root.right.right = new Node(30);

        arrange(root);
        preOrder(root);
    }
}
