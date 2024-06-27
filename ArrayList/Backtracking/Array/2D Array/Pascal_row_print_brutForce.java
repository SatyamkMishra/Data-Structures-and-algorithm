public class Pascal_row_print_brutForce {
    public static int combination(int n,int r){
        int ans =1;
        for(int i=0;i<r;i++){
            ans*=(n-i);
            ans/=(i+1);
        }
        return ans;
    }
    public static void pascal(int n){
        for(int i=1;i<=n;i++){
            System.out.print(combination(n-1,i-1) + " ");
        }
        System.out.println();
    }


    //whole traingle

    public static void traingle(int n){

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(combination(i-1,j-1) + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=6;
        pascal(n);
        traingle(6);
    }
}
