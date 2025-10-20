class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n= nums.length;
        Map<Integer,Integer> mp= new HashMap<>();
        for(int i=0;i<n;i++){
            if(mp.containsKey(nums[i])){
                if(Math.abs(i-mp.get(nums[i]))<=k){
                    return true;
                }else{
                    mp.put(nums[i],i);
                }
            }else{
                mp.put(nums[i],i);
            }
        }
        return false;
        
    }
}