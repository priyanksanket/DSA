class Solution {
    boolean check(int mid, int []nums, int k){
        int count =1;
        int sum=0;
        for(int num: nums){
            sum+=num;
            if(sum>mid){
                count ++;
                sum = num;
            }
        }
        return count <=k;
    }
    public int splitArray(int[] nums, int k) {
        int sum =0;
        int low = 0;
        for(int x: nums){
            sum+= x;
            low= Math.max(low,x);
        }
        
        int high = sum;
        int ans = high;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(check(mid, nums, k)){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }

        }
        return ans;
    }
}