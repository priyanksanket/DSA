class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count=0;
        HashSet<Character> st= new HashSet<>();
        for(char x: jewels.toCharArray()){
            st.add(x);
        }
        for(char x: stones.toCharArray()){
            if(st.contains(x)) count++;
        }
        return count;
        
    }
}