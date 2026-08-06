class Solution {
    int fun(int i, int j, int [] arr,int [][]dp){
        if(i>j) return 0;
        if(dp[i][j]!= -1) return dp[i][j];
        int max = Integer.MIN_VALUE;
        for(int k = i;k<=j;k++){
            int t = (arr[i-1]*arr[k]*arr[j+1]) + fun(i,k-1,arr,dp) + fun(k+1,j,arr,dp);
            max = Math.max(max,t);
        }
        return dp[i][j]= max;
    }
    public int maxCoins(int[] nums) {
        int n= nums.length+2;
        int [] arr= new int[n];
        arr[0]= 1;
        arr[n-1]=1;
        for(int i= 1;i<n-1;i++){
            arr[i]= nums[i-1];
        }
        int [][] dp = new int[n][n];
        for(int []x: dp){
            Arrays.fill(x,-1);
        }
        return fun(1,n-2,arr,dp);
        
    }
}