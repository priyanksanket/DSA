class Solution {
    public int secondHighest(String s) {
        int l=-1;
        int ans=-1;
        for(int i=0;i<s.length();i++){
            char x= s.charAt(i);
            if(Character.isDigit(x)){
                if(x-'0'>l){
                    ans=l;
                    l=x-'0';
                }else if(x-'0'>ans && x-'0'<l){
                    ans=x-'0';
                }
            }
        }
        return ans;
        
    }
}