public class Zero_One_Kanapsack {

    //using recursion Tc --> O(2^n*w)
    public static int max(int val[], int wt[], int w, int i){

        if(w==0 || i==0){
            return 0;
        }
        int maxi = Integer.MIN_VALUE;
        if(wt[i-1]<=w){
            //consider
            int ans1 = val[i-1] + max(val, wt, w-wt[i-1], i-1);

            //not consider
            int ans2 = max(val, wt, w, i-1);

            maxi = Math.max(ans1,ans2);
        }else{
            max(val, wt, w, i-1);
        }


        return maxi;
    }

    //using Memoization Tc --> O(n*w)

    public static int memo(int val[], int wt[], int dp[][], int w, int i){


        if(w == 0 || i==0){
            return 0;
        }

        if(dp[i][w] != -1){
            return dp[i][w];
        }


        if(wt[i-1] <= w){

            int ans1 = val[i-1] + memo(val, wt, dp, w-wt[i-1], i-1);


            int ans2 = memo(val, wt, dp, w, i-1);

            dp[i][w] = Math.max(ans1,ans2);

            return dp[i][w];
        }else{
            dp[i][w] = memo(val, wt, dp, w, i-1);
            return dp[i][w];
        }
    }

    public static void arr(int dp[][]){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j] = -1;
            }
        }
    }


    //using Tabulation Tc --> O(n*w)
    public static int tabulation(int val[], int wt[], int w){

        int n = val.length;
        int dp[][] = new int[n+1][w+1];

        for(int i=0;i<dp.length;i++){
            dp[i][0] = 0;
        }

        for(int j=0;j<dp[0].length;j++){
            dp[0][j] = 0;
        }

        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[0].length;j++){
                int v = val[i-1];
                int we = wt[i-1];

                if(we<=j){
                    int incProfit = v + dp[i-1][j-we];

                    int excProfit = dp[i-1][j];

                    dp[i][j] = Math.max(incProfit,excProfit);
                }else{
                    dp[i][j] = dp[i-1][j];
                }

            }
        }

        return dp[n][w];

    }
    public static void main(String[] args){

        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int w = 7;
        int dp[][] = new int[val.length+1][w+1];

        arr(dp);
        System.out.println(max(val, wt, w, val.length));

        System.out.println(memo(val, wt, dp, w, val.length));

        System.out.println(tabulation(val, wt, w));
    }
}
