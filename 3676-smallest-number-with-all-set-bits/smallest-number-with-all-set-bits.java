class Solution {
    public int smallestNumber(int n) {
        int i=1;
        while(i<=n){
           i= i<<1;
        }
        return i-1;
        
    }
}