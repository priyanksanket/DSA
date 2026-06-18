class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp =new HashMap<>();
        int sum=0;
        int count =0;
        mp.put(0,1);
        for(int x: nums){
            sum+= x;
            count += mp.getOrDefault((sum-k),0);
            mp.put(sum,mp.getOrDefault(sum,0)+1);
        }
        return count;
        
    }
}