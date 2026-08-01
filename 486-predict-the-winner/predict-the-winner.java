class Solution {
    public int f(int[] nums, int l,int r){
        if(l==r){
            return nums[l];
        }
       int left= nums[l]-f(nums,l+1,r);
       int right=nums[r]- f(nums,l,r-1);
       return Math.max(left,right);
    }
    public boolean predictTheWinner(int[] nums) {
        int x= f(nums,0,nums.length-1);
        return x>=0;
        

        
    }
}