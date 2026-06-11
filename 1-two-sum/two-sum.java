class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int x = nums[i];
            if(mp.containsKey(target-x)){
                return new int[]{mp.get(target-x),i};
            }else{
                mp.put(x,i);
            }
        }
        return new int[]{0,0};

        
    }
}