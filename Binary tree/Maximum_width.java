import java.util.*;
class Maximum_Width {
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
    public static int width(Node root){
        if(root == null){
            return 0;
        }

        Deque<Node> d = new LinkedList<>();
        d.add(root);

        int max = 1;
        while(!d.isEmpty()){
            
            while(!d.isEmpty() && d.getFirst()==null){
                d.removeFirst();
            }
            while(!d.isEmpty() && d.getLast() == null){
                d.removeLast();
            }
            max = Math.max(max,d.size());
            int size = d.size();

            for(int i=0;i<size;i++){
                Node curr = d.poll();
                if(curr == null){
                    d.add(null);
                    d.add(null);
                }
                else{
                    d.add(curr.left);
                    d.add(curr.right);
                }
            }
            
        }
        return max;
    }
    public static void main(String[] args){

        Node root = new Node(2);
        root.left = new Node(1);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(0);
        root.right.right = new Node(1);

        System.out.println(width(root));
    }
}
