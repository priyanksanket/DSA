class Solution {
    boolean check(int mid, int[]nums, int m){
        int count =1;
        int prev = nums[0];
        for(int num: nums){
            if(num-prev >=mid){
                count++;
                prev = num;
            }
        }
        return count >= m;

        
    }
    public int maxDistance(int[] nums, int m) {
        int low = 1;
        int n = nums.length;
        Arrays.sort(nums);
        int high = nums[n-1];
        int ans = low;
        while(low<= high){
            int mid = low + (high-low)/2;
            if(check(mid,nums,m)){
                ans = mid;
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return ans;
    }
}