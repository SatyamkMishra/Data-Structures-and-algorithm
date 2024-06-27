public class SortedArray_to_Bst {
        static class Node{
            int data;
            Node left;
            Node right;
            Node(int data){
                this.data = data;
            }
        }
       
        public static void preOrder(Node root ){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
    
        }

        public static Node sortedArray(int a[], int s , int e){
            if(s>e){
                return null;
            }

            int mid = s + (e-s)/2;

            Node root = new Node(a[mid]);
            root.left = sortedArray(a, s, mid-1);
            root.right = sortedArray(a, mid+1, e);

            return root;

        }
    
        public static void main(String[] args){
            int values[] = {1,2,3,4,5,6,7,8};
            
             Node root = sortedArray(values, 0, values.length-1);

             preOrder(root);
            
        }
    }
    
