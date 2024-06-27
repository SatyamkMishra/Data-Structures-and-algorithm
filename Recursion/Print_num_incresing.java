public class Print_num_incresing {
    public static void increse(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        increse(n-1);
        System.out.print(n + " ");
    }
    public static void main(String[] args){
        increse(10);
    }
}
