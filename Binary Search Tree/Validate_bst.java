import java.util.*;
public class Validate_bst {
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
    public static void inOrder(Node root , ArrayList<Integer> a){
        if(root == null){
            return;
        }
        inOrder(root.left,a);
        a.add(root.data);
        inOrder(root.right,a);

    }

    public static boolean validBst(Node root){
        if(root == null){
            return true;
        }
        ArrayList<Integer> a = new ArrayList<>();
        inOrder(root, a);

        for(int i=1;i<a.size();i++){
            if(a.get(i-1)>=a.get(i)){
                return false;
            }
        }
        return true;
    }

    public static boolean isValidBst(Node root, Node min, Node max){
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        }

        if(max != null && root.data >= max.data){
            return false;
        }

        return isValidBst(root.left, min, root) && isValidBst(root.right, root, max);

    }
    public static void main(String[] args){

        int val[] = {1,1,1,1,1,1};
        Node root = null;

        for(int i=0;i<val.length;i++){
            root = insert(root, val[i]);
        }
        ArrayList<Integer> a = new ArrayList<>();
        inOrder(root, a);

        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i) + " ");
        }

        System.out.println(validBst(root));
        System.out.println(isValidBst(root,null,null));
        
    }
}

