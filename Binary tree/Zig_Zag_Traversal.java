import java.util.*;
public class Zig_Zag_Traversal {
    
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

    public static void zig(Node root,ArrayList<ArrayList<Integer>> a){
        Queue<Node> q = new LinkedList<>();

        q.offer(root);
        q.offer(null);
        ArrayList<Integer> temp = new ArrayList<>();
        int size = 0;
        while(!q.isEmpty()){
            Node t = q.poll();
          
            if(t == null){
                if(size%2==0){
                   a.add(temp); 
                }else{
                    Collections.reverse(temp);
                    a.add(temp);
                }
                size++;
                temp = new ArrayList<>();
                if(q.isEmpty()){
                    break;
                }else{
                    q.offer(null);
                }
            }else{
                temp.add(t.data);
                if(t.left != null){
                    q.offer(t.left);
                }
                if(t.right != null){
                    q.offer(t.right);
                }
            }
        }
    }

    public static void main(String[] args){

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();

        Node root = bt.buildtree(nodes);
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        zig(root,a);
        System.out.println(a);
        
    }
}
