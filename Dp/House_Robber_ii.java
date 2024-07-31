class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        int a1[] = new int[nums.length-1];
        int a2[] = new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            a1[i] = nums[i];
        }
        for(int i=1;i<nums.length;i++){
            a2[i-1] = nums[i];
        }

        return Math.max(solve(a1),solve(a2));

    }

    public static int solve(int nums[]){
        if(nums.length<2){
        return nums[0];
        }  


      int dp[] = new int[nums.length];

      dp[0] = nums[0];
      dp[1] = Math.max(nums[0],nums[1]);


      for(int i=2;i<nums.length;i++){
        dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
      }

      return dp[nums.length-1];
    }
}
