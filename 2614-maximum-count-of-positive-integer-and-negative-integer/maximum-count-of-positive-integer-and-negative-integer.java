class Solution {
    public int maximumCount(int[] nums) {
        int l=nums.length;
        int n=0;
        int p=0;
        for(int i=0;i<l;i++){
            if(nums[i]<0){
                n++;
            }else if(nums[i]>0){
                p++;
            }
        }
        return Math.max(p,n);
        
    }
}