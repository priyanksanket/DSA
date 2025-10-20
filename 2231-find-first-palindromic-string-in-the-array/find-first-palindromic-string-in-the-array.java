class Solution {
    public boolean check(String s){
        int n=s.length();
        int l=0;
        int r= n-1;
        while(l<r){
            if(s.charAt(l)!= s.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String word: words){
            if(check(word)) return word;
        }
        return "";
    }

}