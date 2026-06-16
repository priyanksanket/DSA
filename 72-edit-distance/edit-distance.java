class Solution {
    int fun(int i, int j, String a, String b,int [][]dp){
        if(i<0) return j+1;
        if(j<0) return i+1;
        if(dp[i][j]!= -1) return dp[i][j];
        if(a.charAt(i) == b.charAt(j)) return dp[i][j]= fun(i-1,j-1,a,b,dp);
        return dp[i][j]= 1+ Math.min(fun(i-1,j-1,a,b,dp), Math.min(fun(i-1,j,a,b,dp),fun(i,j-1,a,b,dp)));
    }
    public int minDistance(String word1, String word2) {
        int l = word1.length();
        int s = word2.length();
        int [][] dp = new int [l][s];
        for(int []x: dp){
            Arrays.fill(x,-1);
        }
        return fun(l-1,s-1,word1,word2,dp);
        
    }
}