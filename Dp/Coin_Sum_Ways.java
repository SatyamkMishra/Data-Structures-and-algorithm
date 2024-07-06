public class Coin_Sum_Ways {

    public static int coinChange(int coin[], int sum){

        int dp[][] = new int[coin.length+1][sum+1];

        for(int i=0;i<dp.length;i++){
            dp[i][0] = 1;
        }

        for(int i=0;i<dp[0].length;i++){
            dp[0][i] = 0;
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){

                if(coin[i-1]<=j){
                    dp[i][j] = dp[i][j-coin[i-1]] + dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[coin.length][sum];
    }
    public static void main(String[] args) {
        int coin[] = {2,5,3,6};
        int sum = 10;

        System.out.println(coinChange(coin,sum));
    }
}
