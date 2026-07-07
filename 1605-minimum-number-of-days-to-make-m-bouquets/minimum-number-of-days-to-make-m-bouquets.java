class Solution {
    boolean check(int[]nums, int mid, int m, int k){
        int total = 0;
        int count  = 0;
        for(int num: nums){
            if(num<=mid){
                count ++;
                if(count==k){
                    total ++;
                    count = 0;
                }
            }else{
                count = 0;
            }
        }
        return total >= m;
    }
    public int minDays(int[] nums, int m, int k) {
        int low = 1;
        int high = 0;
        int n = nums.length;
        if((long) m* k > n) return -1;
        
        for(int num: nums){
            high = Math.max(num,high);
        }
        int ans = -1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(check(nums, mid, m,k)){
                ans =mid;
                high = mid-1;
            }else{
                low = mid +1;
            }
            
        }
        return ans ;
        
    }
}