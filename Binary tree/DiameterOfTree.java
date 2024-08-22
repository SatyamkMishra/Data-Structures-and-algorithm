class DiameterOfTree {
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
    static class Info{

        int h;
        int d;
        Info(int h, int d){
            this.h = h;
            this.d = d;
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


    //O(n*n)

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh,rh)+1;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        int h = lh+rh+1;

        int ld = diameter(root.left);
        int rd = diameter(root.right);


        return Math.max(ld,Math.max(rd,h));
    }


    //O(n)

    public static Info diameterOptimize(Node root){

        if(root == null){
            return new Info(0,0);
        }

        Info lInfo = diameterOptimize(root.left);
        Info rInfo = diameterOptimize(root.right);

        int d = Math.max(lInfo.d,Math.max(rInfo.d,lInfo.h+rInfo.h+1));

        int h = Math.max(lInfo.h,rInfo.h)+1;

        return new Info(h,d);
    }
    public static void main(String[] args){

        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();
        Node root = bt.buildtree(nodes);
        System.out.println(root.data);

        System.out.println(diameter(root));
        System.out.println(diameterOptimize(root).d + " " + diameterOptimize(root).h);
    }
}
