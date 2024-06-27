public class Delete_Node {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data < val){
            root.right = insert(root.right, val);
        }
        else{
            root.left = insert(root.left, val);
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static Node delete(Node root , int val){

        if (root == null) {
            return root;
        }
    
        if(root.data < val){
            root.right = delete(root.right, val);
        }

        else if(root.data > val){
            root.left = delete(root.left, val);
        }

        else{

            if(root.left == null && root.right == null){
                return null;
            }

            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            Node is = inOrderSuccessor(root.right);
            root.data = is.data;
            root.right = delete(root.right, is.data);

        }
        return root;
    }

    public static Node inOrderSuccessor(Node root){
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
    
    public static void main(String[] args){
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i = 0;i<values.length;i++){
            root = insert(root, values[i]);
        }

        inOrder(root);
        System.out.println();

        root = delete(root, 5);
        inOrder(root);
    }
}
