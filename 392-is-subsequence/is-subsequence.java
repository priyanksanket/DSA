class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        int a=0;
        int b=0;
        while(b<t.length() && a<s.length()){
            char p= s.charAt(a);
            char q= t.charAt(b);
            if(a>=s.length()) return true;
            if(p==q){
                a++;
                b++;
            }else{
                b++;
            }
        }
        if(a>=s.length()) return true;
        return false;
    }
}