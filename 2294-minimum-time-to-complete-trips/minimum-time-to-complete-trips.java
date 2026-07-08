class Solution {
    boolean check(long mid,int []nums, int total){
        long count = 0;
        for(int x: nums){
            count += mid/x;
        }
        return count >= total;
    }
    public long minimumTime(int[] nums, int total) {
        long low = 1;
        int min = nums[0];
        for(int x: nums){
            min = Math.min(min, x);
        }
        long high =1L* total*min;
        long ans = high;
        while(low<= high){
            long mid = low + (high-low)/2;
            if(check(mid, nums, total)){
                ans = mid;
                high = mid-1;

            }else{
                low = mid +1;
            }
        }
        return  ans;
        
    }
}