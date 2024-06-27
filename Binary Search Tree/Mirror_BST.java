import java.util.*;
public class Mirror_BST {
   
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root ,int val){
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
    public static void preOrder(Node root ){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

   public static Node invert(Node root){
    if(root == null){
        return null;
    }

      Node left = invert(root.left);
      Node right = invert(root.right);

      root.left = right;
      root.right = left;

      return root;
   }
    
    public static void main(String[] args){

        
        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);

        root = invert(root);
        preOrder(root);
        
    }
}



