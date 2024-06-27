import java.util.*;
class Maximum_sum_level{
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

    public static int max(Node root){
        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        if(root == null){
            return 0;
        }

        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node curr = q.remove();
            if(curr == null){
                System.out.println("sum " + maxi);
                sum = 0;
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                sum += curr.data;
                System.out.print(curr.data + " ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
            maxi = Math.max(maxi,sum);
        }
        return maxi;

    }

    public static int level(Node root){
        if(root == null){
            return 0;
        }

        int sum = 0;
        int maxi = Integer.MIN_VALUE;
        int level = 0;
        int currLevel = 0;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
           int size = q.size();
           currLevel++;
           sum = 0;
           for(int i=0;i<size;i++){
            Node curr = q.remove();
            sum += curr.data;
            if(curr.left != null){
                q.add(curr.left);
            }
            if(curr.right != null){
                q.add(curr.right);
            }
           } 

           if(maxi<sum){
             maxi = sum;
             level = currLevel;
           }
        }
        return level;

    }
    public static void main(String[] args){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(max(root));
        System.out.println("The highest sum at level " + level(root));
    }
}