class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int [] a1= new int[26];
        int [] a2= new int[26];
        for(int i=0;i<word1.length();i++){
            int p= word1.charAt(i)-'a';
            a1[p]++;
        }
        for(int i=0;i<word2.length();i++){
            int p= word2.charAt(i)-'a';
            a2[p]++;
        }
        for(int i=0;i<26;i++){
            if(Math.abs(a1[i]-a2[i])>3) return false;
        }
        return true;
    }
}