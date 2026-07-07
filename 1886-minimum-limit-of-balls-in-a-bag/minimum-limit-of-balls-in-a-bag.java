class Solution {
    boolean check(int mid, int [] nums, int m){
        long count = 0;
        for(int x: nums){
            count += (x-1)/mid;
            
        }
        if(count > m) return false;
        return true;
    }
    public int minimumSize(int[] nums, int m) {
        
        int low = 1;
        int high  = 0;

        for(int x: nums){
            high = Math.max(high, x);
        }
        int ans = high;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(check(mid, nums,m )){
                ans = mid;
                high= mid -1;
            }else {
                low = mid + 1;
            }
        }
        return ans;
    }
}