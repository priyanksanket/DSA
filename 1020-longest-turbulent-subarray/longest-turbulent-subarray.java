class Solution {
    public int maxTurbulenceSize(int[] nums) {
        int n = nums.length;
        
        int [][] dp = new int[n][2];
        int max = 1;
        dp[n-1][0]= 1;
        dp[n-1][1] = 1;
        
        for(int i = n-2;i>=0;i--){
            if(nums[i]>nums[i+1]){
                dp[i][0]=dp[i+1][1]+1;
                max = Math.max(dp[i][0],max);
                dp[i][1]= 1;
            }else if(nums[i]<nums[i+1]){
                dp[i][1]= dp[i+1][0]+1;
                max = Math.max(dp[i][1],max);;
                dp[i][0] = 1;
            }else{
                dp[i][0]=1;
                dp[i][1]=1;
            }
        }
        return max;


        
    }
}