class Solution {
    int fun(int i, int j, int[]nums, int [][]dp){
        if(i>j) return 0;
        if(dp[i][j]!= 0) return dp[i][j];
        int min = (int)1e9;
        for(int k = i;k<=j;k++){
            int t = (nums[j+1]-nums[i-1]) + fun(i,k-1,nums, dp)+fun(k+1,j,nums,dp);
            min = Math.min(min, t);
        }
        return dp[i][j]= min;
    }
    public int minCost(int n, int[] cuts) {
        int x = cuts.length;
        int[] nums = new int[x+2];
        nums[x+1]= n;
        for(int i = 1;i<= x;i++){
            nums[i]= cuts[i-1];
        }

        Arrays.sort(nums);
        int[][] dp = new int [x+1][x+1];
        return fun(1,x,nums,dp);
        
    }
}