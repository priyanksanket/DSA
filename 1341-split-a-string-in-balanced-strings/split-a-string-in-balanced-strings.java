class Solution {
    public int balancedStringSplit(String s) {
        int r=0;
        int l=0;
        int count=0;
        for(char x: s.toCharArray()){
            if(x=='R'){
                r++;
            }else{
                l++;
            }
            if(l==r) count++;
        }
        return count;
        
    }
}