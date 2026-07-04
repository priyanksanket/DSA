class Solution {
    public int smallestDivisor(int[] nums, int t) {
        
        int high = 0;
        
        for(int x: nums){
            high = Math.max(high, x);
        }
        int low =1;
        int ans = high;
        while(low<=high){
            int mid = low + (high-low)/2;
            long sum =0;
            for(int x: nums){
                sum+=  ((x+mid-1)/mid);
            }
            if(sum> t){
                low = mid +1;
            }else{
                high = mid-1;
                ans = mid;
            }
        }
        return ans;
    }
}