class Solution {
    public boolean checkIfPangram(String s) {
        
        int [] nums= new int[26];
        for(char x: s.toCharArray()){
            int i= x-'a';
            nums[i]++;
        }
        for(int i=0;i<26;i++){
            if(nums[i]<1){
                return false;
            }
        }
        return true;
        
    }
}