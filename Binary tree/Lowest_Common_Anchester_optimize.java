public class Lowest_Common_Anchester_optimize {
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
    
        public static Node common_anchestor(Node root, int n1, int n2){
            if(root == null || root.data == n1 || root.data == n2){
                return root;
            }
    
            Node left  = common_anchestor(root.left, n1, n2);
            Node right =  common_anchestor(root.right, n1, n2);
    
            if(left == null){
                return right;
            }
            else if(right == null){
                return left;
            }
    
            return root;
        }
        public static void main(String[] args){
    
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.left = new Node(6);
            root.right.right = new Node(7);
    
            System.out.println(common_anchestor(root, 4, 5).data);
        }
    }
    

