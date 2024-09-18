import java.util.*;

public class FlattenTree {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void flatten(Node root)
    {
        //code here
        
        ArrayList<Integer> a = new ArrayList<>();
        preOrder(a,root);
       
        Node curr = root;
        
        for(int i=1;i<a.size();i++){
            curr.left = null;
            curr.right = new Node(a.get(i));
            curr = curr.right;
        }
    }
    
    public static void preOrder(ArrayList<Integer> a,Node root){
        if(root == null){
            return;
        }
        
        a.add(root.data);
        preOrder(a,root.left);
        preOrder(a,root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.right = new Node(6);
        root.right.right = new Node(7);
        root.right.left = new Node(8);


        ArrayList<Integer> a = new ArrayList<>();
        preOrder(a, root);
        System.out.println(a);
        ArrayList<Integer> ar = new ArrayList<>();
        flatten(root);
        preOrder(ar, root);
        System.out.println(ar);
    }
}
