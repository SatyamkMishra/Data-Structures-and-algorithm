import java.util.*;
public class Kth_Anchestor_node {
    
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

    public static int kAnchester(Node root, int n, int k){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int left = kAnchester(root.left, n, k);
        int right = kAnchester(root.right, n, k);

        if(left == -1 && right == -1){
            return -1;
        }
        
        int maxi = Math.max(left,right);
        
        if(maxi+1 == k){
            System.out.println(root.data);
        }
        
        return maxi+1;
    }


    public static void main(String[] args){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);


        kAnchester(root, 5, 1);

    }
}


