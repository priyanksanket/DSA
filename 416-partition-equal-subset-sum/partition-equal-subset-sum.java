class Solution {
    
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n= nums.length;
        
        for(int i:nums){
            sum+=i;
        }
        if(sum%2==1) return false;
        
        int h= sum/2;
        boolean[][]dp= new boolean[n][h+1];
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
        // if(nums[0]<=h){
        //     dp[0][nums[0]]=true;
        // }
        
        
        for(int i=1;i<n;i++){
            for(int j=1;j<=h;j++){
                boolean ex= dp[i-1][j];
                boolean in= false;
                if(nums[i]<=j){
                    in= dp[i-1][j-nums[i]];
                }
                dp[i][j]=(ex||in);
            }

        }
        return dp[n-1][h];

        
    }
}