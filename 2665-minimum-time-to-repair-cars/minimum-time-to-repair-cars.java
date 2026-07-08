class Solution {
    boolean check(long mid, int []nums, int cars){
        long count = 0;
        for(int x: nums){
            long a = mid/x;
            long b = (long) Math.sqrt(a);
            count += b;
        }
        return count >= cars;
    }
    public long repairCars(int[] nums, int cars) {
        long low = 1;
        
        int min = nums[0];
        for(int x: nums){
            min = Math.min(x,min);
        }
        long high = 1L * cars * cars *  min;

        long ans = high;
        while(low <= high){
            long mid = low + (high-low)/2;
            if(check(mid, nums, cars)){
                ans = mid;
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return ans;
    }
}