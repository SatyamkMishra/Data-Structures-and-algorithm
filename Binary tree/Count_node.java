class Count_node {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public Node buildTree(int nodes[]) {
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

    public static int count(Node root) {
        if (root == null) {
            return 0;
        }

        int left = count(root.left);
        int right = count(root.right);

        int total = left + right + 1;

        return total;
    }

    public static void main(String[] args) {

        int nodes[] = {1,2,3,4,5,6};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println(count(root));
    }
}
