class Solution {
    public int maxProfit(int[] nums) {
        
        int n = nums.length;
        int max = 0;
        int md = 0;
        for(int i= n-1;i>=0;i--){
            if(nums[i]>max){
                max = nums[i];
            }
            else{
                int d =max-nums[i];
                md = Math.max(md,d);
            }
        }
        return md;
        
    }
}