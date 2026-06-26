class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int d = ans;
        
        for(int i=0;i<n;i++){
            for (int j = i+1;j<n;j++){
                for(int k= j+1;k<n;k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    int diff = Math.abs(target- sum);
                    if(diff == 0) return target;
                    if (diff < d){
                        ans  = sum;
                        d = diff;
                    }
                }
            }
        }
        return ans;
        
    }
}