import java.util.*;
public class Merge_two_bst {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    public static void getInorder(Node root, ArrayList<Integer> a){
        if(root == null){
            return;
        }

        getInorder(root.left, a);
        a.add(root.data);
        getInorder(root.right, a);
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node mergeBst(Node root1, Node root2){
        ArrayList<Integer> a1 = new ArrayList<>();
        getInorder(root1, a1);
        ArrayList<Integer> a2 = new ArrayList<>();
        getInorder(root2, a2);

        ArrayList<Integer> a = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i<a1.size() && j<a2.size()){
            if(a1.get(i)<=a2.get(j)){
                a.add(a1.get(i));
                i++;
            }
            else{
                a.add(a2.get(j));
                j++;
            }
        }

        while(i<a1.size()){
            a.add(a1.get(i));
            i++;
        }

        while(j<a2.size()){
            a.add(a2.get(j));
            j++;
        }

        return makeBst(a,0,a.size());
    }

    public static Node makeBst(ArrayList<Integer> a , int s, int e){
        if(s>e){
            return null;
        }

        int mid = (s+e)/2;
        Node root = new Node(a.get(mid));
        root.left = makeBst(a, s, mid-1);
        root.right = makeBst(a, mid+1, e);

        return root;
    }
    public static void main(String[] args) {
        
 
            /* 
                 3
                / \
                1 5
            */
        Node root1 = new Node(3);
        root1.left = new Node(1);
        root1.right = new Node(5);
 
            /*
                 4
                / \
                2 6
            */
        Node root2 = new Node(4);
        root2.left = new Node(2);
        root2.right = new Node(6);
         

        Node root = mergeBst(root1, root2);
        preOrder(root);
    }
}
