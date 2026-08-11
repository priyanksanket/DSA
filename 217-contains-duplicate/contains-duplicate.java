class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int x: nums){
            if(st.contains(x)) return true;
            st.add(x);
        }
        return false;
    }
}