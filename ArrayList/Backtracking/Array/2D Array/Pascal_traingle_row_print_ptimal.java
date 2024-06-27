public class Pascal_traingle_row_print_ptimal {
    public static void row(int n){
        long ans = 1;
        System.out.print(ans +" ");
        for(int i=1;i<n;i++){
            ans*=(n-i);
            ans/=i;
            System.out.print(ans +" ");
        }
        
    }


    public static void main(String[] args){
        row(7);
    }
}
