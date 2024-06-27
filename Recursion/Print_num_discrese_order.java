public class Print_num_discrese_order{
    public static void discrese(int n){
        if(n==1){
            System.out.print(1);
            return;
        }
        System.out.print(n + " ");
        discrese(n-1);
    }
    public static void main(String[] args){
        discrese(10);
    }
}