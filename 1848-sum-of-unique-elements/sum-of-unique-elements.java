class Solution {
    public int sumOfUnique(int[] nums) {
        int n= nums.length;
        int ans=0;
        int [] arr= new int[101];
        for(int i=0;i<n;i++){
            arr[nums[i]]++;
        }
        for(int i=0;i<101;i++){
            if(arr[i]==1){
                ans+=i;
            }
        }
        return ans;
        
    }
}