import java.util.*;
class Each_label_Average{

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

    public static class BinaryTree{

        static int idx = -1;
        public static Node buildtree(int node[]){

            idx++;

            if(node[idx]== -1){
                return null;
            }

            Node newNode = new Node(node[idx]);
            newNode.left = buildtree(node);
            newNode.right = buildtree(node);

            return newNode;
        }
    }

    public static void average(Node root){
        int sum = 0;
        int count = 0;
       if(root == null){
        return;
       }

       Queue<Node> q = new LinkedList<>();

       q.add(root);
       q.add(null);

       while(!q.isEmpty()){
        Node curr = q.remove();

        if(curr == null){
            System.out.println("Avg : " + sum/count);
            sum = 0;
            count = 0;
            if(q.isEmpty()){
                break;
            }
            else{
                q.add(null);
            }
        }

        else{
            sum += curr.data;
            count++;
            System.out.print(curr.data + " ");
            if (curr.left != null) {
                q.add(curr.left);
            }
            if (curr.right != null) {
                q.add(curr.right);
            }
        }
       }
    }
    public static void main(String[] args){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        
        average(root);
    }
}