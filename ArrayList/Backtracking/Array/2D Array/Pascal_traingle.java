public class Pascal_traingle {
    public static void traingle(int n){
        
        for(int i=1;i<=n;i++){
            int ans = 1;
            System.out.print(ans+" ");
            for(int j=1;j<i;j++){
                ans*=(i-j);
                ans/=j;
                System.out.print(ans+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        traingle(6);
    }
}
