/*You are given the root of a full binary tree with the following properties:

Leaf nodes have either the value 0 or 1, where 0 represents False and 1 represents True.
Non-leaf nodes have either the value 2 or 3, where 2 represents the boolean OR and 3 represents the boolean AND.
The evaluation of a node is as follows:

If the node is a leaf node, the evaluation is the value of the node, i.e. True or False.
Otherwise, evaluate the node's two children and apply the boolean operation of its value with the children's evaluations.
Return the boolean result of evaluating the root node.

A full binary tree is a binary tree where each node has either 0 or 2 children.

A leaf node is a node that has zero children.

  */
public class Boolean_Binary_Tree {

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

    public static boolean evaluate(Node root){

        if(root.left == null && root.right == null){
            if(root.data == 0){
                return false;
            }
            if(root.data == 1){
                return true;
            }
        }

        boolean left = evaluate(root.left);
        boolean right = evaluate(root.right);

        if(root.data == 2){
            return left || right;
        }
        else{
            return left && right;
        }
    }
    public static void main(String[] args){

        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        root.right.left = new Node(0);
        root.right.right = new Node(1);

        System.out.println(evaluate(root));
    }
}
