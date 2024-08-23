import java.util.*;

public class Maximum_pathSum {

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

        public Node buildtree(int node[]){

            idx++;
            if(node[idx] == -1){
                return null;
            }

            Node newNode = new Node(node[idx]);
            newNode.left = buildtree(node);
            newNode.right = buildtree(node);

            return newNode;
        }
    }

    public static int pathSum(Node root, int a[]){
        if(root == null){
            return 0;
        }

        int left = Math.max(0,pathSum(root.left, a));
        int right = Math.max(0,pathSum(root.right, a));

        a[0] = Math.max(a[0],root.data + left + right);

        return root.data + Math.max(left,right);
    }
    public static void main(String[] args){

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();

        Node root = bt.buildtree(nodes);

        int a[] = new int[1];
        pathSum(root, a);
        System.out.println(a[0]);
    }
}
