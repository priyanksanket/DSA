class Solution {
    public boolean canConstruct(String r, String m) {
        
        int []arr = new int[26];
        for(char x:m.toCharArray()){
            arr[x-'a']++;
        }
        for(char x:r.toCharArray()){
            arr[x-'a']--;
        }
        for(int i=0;i<26;i++){
            if(arr[i]<0)return false;
        }
        return true;
        
    }
}