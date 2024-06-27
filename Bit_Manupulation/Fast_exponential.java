public class Fast_exponential {
    public static int e(int n , int power){
        int ans = 1;

        while(power>0){
            if((n&1)==1){
                ans = ans*n;
            }
            n=n*n;
           power=power>>1;
        }
        return ans;
    }
    public static void main(String[] args){
         System.out.println(e(5,3));
    }
}
