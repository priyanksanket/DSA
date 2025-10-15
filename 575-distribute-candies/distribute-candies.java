class Solution {
    public int distributeCandies(int[] nums) {
        int n= nums.length;
        Map<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(nums[i],1);
        }
        return Math.min((n/2),mp.size());
        
    }
}