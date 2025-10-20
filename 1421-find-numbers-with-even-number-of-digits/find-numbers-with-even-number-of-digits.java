class Solution {
    public boolean check(int n){
        int count =0;
        while(n>0){
            count++;
            n/=10;
        }
        if((count & 1)==1){
            return false;
        }
        return true;
    }
    public int findNumbers(int[] nums) {
        int n= nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(check(nums[i])){
                count++;
            }
        }
        return count;
        
    }
}