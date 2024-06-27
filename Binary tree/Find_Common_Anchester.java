import java.util.*;
public class Find_Common_Anchester{
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

    public static boolean getPath(Node root, int n, ArrayList<Node> list){
        if(root == null){
            return false;
        }

        list.add(root);

        if(root.data == n){
            return true;
        }

        boolean foundLeft = getPath(root.left,n,list);
        boolean foundRight = getPath(root.right,n,list);

        if(foundLeft || foundRight){
            return true;
        }

        list.remove(list.size()-1);

        return false;
    }

    public static Node lca(Node root,int n, int m){
        ArrayList<Node> l1 = new ArrayList<>();
        ArrayList<Node> l2 = new ArrayList<>();

        getPath(root,n,l1);
        getPath(root,m,l2);

        int i=0;
        for(;i<l1.size() && i<l2.size();i++){
            if(l1.get(i) != l2.get(i)){
                break;
            }
        }
        Node ans = l1.get(i-1);
        return ans;
    }
    public static void main(String[] args){

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(lca(root, 4, 5).data);
    }
}