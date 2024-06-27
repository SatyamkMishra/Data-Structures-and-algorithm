class Height_Of_Bt{

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
        public static Node buildTree(int nodes[]){
            idx++;
            if (idx >= nodes.length || nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int left = height(root.left);
        int right = height(root.right);

        int total = Math.max(left,right) + 1;

        return total;
    }

    public static void main(String[] args){

        int nodes[] = {3,9,20,-1,-1,15,7};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println(height(root));
    }
}