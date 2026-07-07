class Solution {
    boolean check(int mid, int []nums, int p){
        int prev = nums[0];
        int count = 0;
        int i = 1;
        int n = nums.length;
        while(i<n){
            if(nums[i]-prev <= mid){
                count ++;
                i++;
                if(i<n){
                    prev = nums[i];
                }
            }
            else{
                prev = nums[i];
            }
            i++;
        }
        return count >= p;
    }
    public int minimizeMax(int[] nums, int p) {
        
        int low = 0;
        int n = nums.length;
        Arrays.sort(nums);
        int high = nums[n-1];
        int ans = high;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(check(mid,nums, p)){
                ans = mid;
                high = mid-1;
                
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}