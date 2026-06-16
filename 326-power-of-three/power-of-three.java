class Solution {
    boolean fun(int n){
        // base case
        if(n==1) return true;
        if(n<1) return false;
        if(n%3!=0) return false;

        // recursive work
        return fun(n/3);
    }
    public boolean isPowerOfThree(int n) {
        return fun(n);
        
    }
}