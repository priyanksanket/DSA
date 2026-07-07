class Solution {
    boolean check(long mid, int[] nums, int n ){
        int count =0 ;
        for(int x: nums){
            count += (x+mid-1)/mid;
        }
        return count <= n;
    }
    public int minimizedMaximum(int n, int[] nums) {
        long low = 1;
        long high = 0;
        for(int x : nums){
            high += x;
        }
        long ans = high;
        while(low<= high){
            long mid = low + (high-low)/2;
            if(check(mid, nums,n)){
                ans = mid ;
                high = mid-1;
            }else {
                low = mid +1;
            }
        }
        return (int) ans;
        
    }
}