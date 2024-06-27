class Kth_level{
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

    public static void kth(Node root,int currLevel, int level){

        if(root == null){
            return;
        }

        if(currLevel == level){
            System.out.print(root.data +" ");
        }

        kth(root.left,currLevel+1,level);
        kth(root.right,currLevel+1,level);
    }
    public static void main(String[] args){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        kth(root,0,2);
    }
}