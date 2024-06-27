public class Print_in_Range {
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

        if(root.data > val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
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

    public static void inrange(Node root, int low , int high){

        if(root == null){
            return;
        }

        if(root.data >= low && root.data <= high){
            inrange(root.left, low, high);
            System.out.print(root.data + " ");
            inrange(root.right, low, high);
        }

        else if (root.data < low) {
            inrange(root.right, low, high);
        }
        
        else{
            inrange(root.left, low, high);
        }
    }

    public static void main(String[] args){
        int values[] = {5,1,3,4,2,7};
        Node root = null;

        for(int i = 0;i<values.length;i++){
            root = insert(root, values[i]);
        }

        System.out.println("Inorder traversal:");
        inOrder(root);
        System.out.println();
    
        System.out.println("Values in range 2 to 11:");
        inrange(root, 2, 11); 
        
    }
}
