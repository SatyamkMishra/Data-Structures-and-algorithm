import java.util.*;
public class Iterative_traversal {

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

    static class BinaryTree{

        static int idx = -1;

        public Node buildtreee(int node[]){

            idx++;
            if(node[idx] == -1){
                return null;
            }

            Node newNode = new Node(node[idx]);
            newNode.left = buildtreee(node);
            newNode.right = buildtreee(node);

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
    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildtreee(nodes);
        // System.out.println(root.data);
        preOrder(root);
        
        inOrder(root);

        postOrder(root);
    }
}
