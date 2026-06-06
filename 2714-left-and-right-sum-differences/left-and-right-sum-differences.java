class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n= nums.length;
        int [] left = new int[n];
        int [] right= new int[n];
        for (int i=0; i<n;i++){
            
            for(int j= 0;j<i;j++){
                left[i]+= nums[j];
            }
            for(int j=i+1;j<n;j++){
                right[i]+= nums[j];
            }

        }
        for(int i= 0;i<n;i++){
            left[i]= Math.abs(left[i]- right[i]);
        }
        return left;
    }
}