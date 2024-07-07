import java.util.*;
public class Longest_Common_Subsequence {

    public static int lcs(String s1, String s2){
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n+1][m+1];

        
        for(int i=0;i<dp.length;i++){
            dp[i][0] = 0;
        }

        for(int i=0;i<dp[0].length;i++){
            dp[0][i] = 0;
        }


        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }

        return dp[n][m];
    }
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";

        System.out.println(lcs(s1,s2));
    }
}
