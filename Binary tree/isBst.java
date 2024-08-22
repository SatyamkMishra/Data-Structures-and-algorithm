//A tree is said to be balanced if the difference between left
//height of the tree and right height of the tree 
import java.util.*;
public class isBst {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static void preOrder(Node root){
        Stack<Node> s = new Stack<>();

        s.push(root);

        while(!s.isEmpty()){
            Node t = s.pop();

            System.out.print(t.data + " ");
            if(t.right != null){
                s.push(t.right);
            }
            if(t.left != null){
                s.push(t.left);
            }
        }
        System.out.println();
    }

    public static void inOrder(Node root){
        Stack<Node> s = new Stack<>();
        
        while(true){
            if(root != null){
                s.push(root);
                root = root.left;
            }else{
                if(s.isEmpty()){
                    break;
                }

                root = s.pop();
                System.out.print(root.data + " ");
                root = root.right;
            }
        }
        System.out.println();
    }

    public static void postOrder(Node root){
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        s1.push(root);

        while(!s1.isEmpty()){

            Node t = s1.pop();
            s2.push(t);
            if(t.left != null){
                s1.push(t.left);
            }
            if(t.right != null){
                s1.push(t.right);
            }
        }

        while(!s2.isEmpty()){
            System.out.print(s2.pop().data + " ");
        }
        System.out.println();
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh,rh)+1;
    }
    public static boolean isBalancedTree(Node root){
        if(root == null){
            return true;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        if(Math.abs(lh-rh)>1){
            return false;
        }

        boolean l = isBalancedTree(root.left);
        boolean r = isBalancedTree(root.right);

        if(!l || !r){
            return false;
        }

        return true;
    }

    //O(n)
    public static int isBalanced(Node root){
        if(root == null){
            return 0;
        }
        int lh = isBalanced(root.left);
        int rh = isBalanced(root.right);
        if(lh == -1 ||rh == -1){
            return -1;
        }
        if(Math.abs(lh-rh)>1){
            return -1;
        }

        return Math.max(lh,rh)+1;
    }
    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);
        System.out.println(root.data);
        preOrder(root);
        inOrder(root);
        postOrder(root);

        int ans = isBalanced(root);
        System.out.println("Is the tree balanced " + (ans == -1 ? "false" : "true"));

        System.out.println(isBalancedTree(root));
    }
}
