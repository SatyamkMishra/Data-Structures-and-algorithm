//Count Ways to reach the nth stairs. The person can climb either 1 stairs or 2 stairs or 3 at a time
import java.util.*;
public class Climbing_Stairs2 {

    //Using Memorization
    public static int countWaysMemo(int n, int dp[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }

        if(n==2){
            return 2;
        }
        if(n==1){
            return 1;
        }
        
        if(dp[n] != 0){
            return dp[n];
        }

        dp[n] = countWaysMemo(n-1, dp) + countWaysMemo(n-2, dp) + countWaysMemo(n-3, dp);

        return dp[n];
    }

    //using tabulation
    public static int countWaysTab(int n){

        int dp[] = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;

        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        return dp[n];
    }
    public static void main(String[] args) {
        int n = 4;
        int dp[] =  new int[n+1];

        System.out.println(countWaysMemo(n, dp));
        System.out.println(countWaysTab(n));
    }
}
