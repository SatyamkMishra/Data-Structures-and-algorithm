class Diameter_of_tree {

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

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int right = height(root.right);
        int left = height(root.left);

        int max = Math.max(left, right) + 1;

        return max;
    }

    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftD = diameter(root.left);
        int rightD = diameter(root.right);

        int leftH = height(root.left);
        int rightH = height(root.right);

        int selfD = leftH + rightH + 1;

        
        int total = Math.max(leftD, Math.max(rightD, selfD));

        return total;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(diameter(root));
    }
}
