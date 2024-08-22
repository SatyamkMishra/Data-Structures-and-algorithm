import java.util.*;
public class All_Traversal_in_one {
    
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    static class Pair{
        Node root;
        int num;
        Pair(Node root, int num){
            this.root = root;
            this.num = num;
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

    public static void allOrder(Node root){
        Stack<Pair> s = new Stack<>();

        s.push(new Pair(root,1));

        ArrayList<Integer> pre = new ArrayList<>();
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> post = new ArrayList<>();

        while(!s.isEmpty()){
            Pair p = s.pop();

            if(p.num == 1){
                pre.add(p.root.data);
                p.num++;
                s.push(p);

                if(p.root.left != null){
                    s.push(new Pair(p.root.left,1));
                }
            }

           else if(p.num == 2){
                in.add(p.root.data);
                p.num++;
                s.push(p);

                if(p.root.right != null){
                    s.push(new Pair(p.root.right,1));
                }
            }

            else{
                post.add(p.root.data);
            }
        }

        System.out.println("Pre-order: " + pre);
        System.out.println("In-order: " + in);
        System.out.println("Post-order: " + post);
    }
    public static void main(String[] args){
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();

        Node root = bt.buildtree(nodes);

        System.out.println(root.data);


        allOrder(root);
    }
}
