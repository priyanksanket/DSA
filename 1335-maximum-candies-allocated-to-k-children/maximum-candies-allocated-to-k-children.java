class Solution {
    boolean check(int mid, int[] nums, long k){
        long count = 0;
        for(int x : nums){
            count += x/mid;
        }
        return count >= k;

    }
    public int maximumCandies(int[] nums, long k) {
        int low = 0;
        int high = 0;
        long sum = 0;
        for(int x: nums){
            high = Math.max(high, x);
            sum+= x;
        }
        if(sum<k) return 0;
        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(mid ==0 || check(mid, nums,k)){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;

            }
        }
        return ans;

        
    }
}