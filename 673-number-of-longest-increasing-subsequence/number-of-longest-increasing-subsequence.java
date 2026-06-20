class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n= nums.length;
        int dp[]= new int[n];
        dp[0]=1;
        int max=1;
        int[] count= new int[n];
        Arrays.fill(count,1);
        Arrays.fill(dp,1);
        for(int i=1;i<n;i++){
             for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(dp[j]+1>dp[i]){
                        dp[i]=dp[j]+1;
                        count[i] =count[j];
                    }else if(dp[j]+1== dp[i]){
                        count[i]+=count[j];
                    }
                    
                }
             }
            max= Math.max(max,dp[i]);
             
             
             
        }
        int sum=0;
        for(int i=0;i<n;i++){
                if(dp[i]==max){
                    sum+=count[i];
                }
             }
             return sum;
        
    }
}