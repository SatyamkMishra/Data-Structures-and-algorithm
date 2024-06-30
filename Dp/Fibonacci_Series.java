public class Fibonacci_Series {

    //Using recursion TC = O(2^n)

    public static int fib(int n){
        if(n<=1){
            return n;
        }

        return fib(n-1) + fib(n-2);
    }

    //using Dynamic Programming TC = O(n)
    
    public static int usingMemorization(int n, int dp[]){

        if(n<=1){
            return n;
        }

        if(dp[n] != 0){
            return dp[n];
        }

        dp[n] = usingMemorization(n-1, dp) + usingMemorization(n-2, dp);

        return dp[n];
    }

    public static int usingTabulization(int n){
        int dp[] = new int[n+1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
    public static void main(String[] args){

        int n = 5;

        System.out.println(fib(n));

        int dp[] = new int[n+1];
        System.out.println(usingMemorization(n,dp));

        System.out.println(usingTabulization(n));
    }
}
