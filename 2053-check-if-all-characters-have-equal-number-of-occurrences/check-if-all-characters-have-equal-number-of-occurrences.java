class Solution {
    public boolean areOccurrencesEqual(String s) {
        int n=s.length();
        int[] arr= new int[26];
        for(int i=0;i<n;i++){
            int p= s.charAt(i)-'a';
            arr[p]++;
        }
        int check= arr[s.charAt(0)-'a'];
        for(int i=0;i<26;i++){
            if(arr[i]>0 && arr[i]!= check){
                return false;
            }
        }
        return true;
    }
}