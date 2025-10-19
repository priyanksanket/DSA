class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> st= new HashSet<>();
        int n= nums.length;
        for (int i=0;i<n ;i++){
            st.add(nums[i]);
        }
        int ans=0;
        for(int num: st){
            if(!st.contains(num-1)){
                int cn= num;
                int l=1;
                while(st.contains(cn+1)){
                    l++;
                    cn++;
                }
                ans= Math.max(l,ans);
            }
        }
        return ans;
        
    }
}