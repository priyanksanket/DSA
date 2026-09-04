class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int [] ps = new int[n];
        int [] s = new int[n];
        ps[0]= nums[0];
        s[n-1]= nums[n-1];
        for(int i=1;i<n;i++){
            ps[i]= Math.max(ps[i-1],nums[i]);
        }
        for(int i=n-2;i>=0;i--){
            s[i]=Math.min(s[i+1],nums[i]);
        }
        for(int i=0;i<n;i++){
            if(ps[i]-s[i]<= k) return i;
        }
        return -1;
        
    }
}