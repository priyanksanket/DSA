class Solution {
    boolean check(int mid, String s, String p, int [] rem){
        Set<Integer> st = new HashSet<>();
        for(int i = 0;i< mid;i++){
            st.add(rem[i]);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length(); i++){
            if(!st.contains(i)){
                sb.append(s.charAt(i));
            }
        }
        int i = 0;
        int j = 0;
        int count = p.length();
        while(i< sb.length() && j < p.length()){
            if(count ==0 ) return true;
            if(sb.charAt(i)==p.charAt(j)){
                count --;
                
                j++;
            }
            i ++;
            
        }
        return count ==0;

    }
    public int maximumRemovals(String s, String p, int[] rem) {
        int low = 0;
        int high = rem.length;
        int ans = 0;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(check(mid, s,p, rem)){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid -1;

            }
        }
        return ans;
        
    }
}