class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] arr= s.toCharArray();
        int n= arr.length;
        int l=0;
        int r=0;
        int max=0;
        Set<Character> st= new HashSet<>();
        while(r<n){
            if(st.contains(arr[r])){
                max= Math.max(max, (r-l));
                while(arr[l]!=arr[r]){
                    st.remove(arr[l]);
                    l++;
                }
                l++;
                r++;
            }else{
                st.add(arr[r]);
                r++;
            }
        }
        max= Math.max(max, (r-l));
        return max;
        
    }
}