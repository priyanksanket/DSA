class Solution {
    public int maxProfit(int[] nums) {
        int sum = 0;
        int n = nums.length;
        for (int i= 1;i<n;i++){
            if(nums[i]>nums[i-1]){
                sum+= nums[i]-nums[i-1];
            }
        }
        return sum;
        
    }
}