class Solution {
    boolean check(int mid, int [] nums, int k){
        int candy = 1;
        int n = nums.length;
        int prev = nums[0];
        int i = 1;
        while(i<n){
            if(nums[i]-prev >= mid){
                candy ++;
                prev = nums[i];

            }
            i++;
        }
        return candy >= k;
    }
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int n = price.length;
        int low = 0;
        int high = price[n-1];
        int ans = 0;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(check(mid, price, k)){
                ans = mid;
                low = mid + 1;

            }else {
                high = mid -1;
            }
        }
        return ans;
    }
}