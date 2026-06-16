class Solution {
    int [] dp;
     int fun(int n){
       if(n<=1) return n;
        return dp[n]= fun(n-1)+fun(n-2);
    }

    public int fib(int n) {
        dp=new int[n+1];

        return fun(n);
    }
}