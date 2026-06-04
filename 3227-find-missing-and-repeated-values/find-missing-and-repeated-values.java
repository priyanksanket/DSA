class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid[0].length;
        int l = n*n;
        int[] f = new int[l+1];
        for(int []x: grid){
            for(int i: x){
                f[i]++;
            }
        }
        int [] ans = new int[2];
        for(int i=1;i<=l;i++){
            if(f[i]==0){
                ans[1]=i;
            }
            else if(f[i]>1){
                ans[0]=i;
            }
        }
        return ans;


        
    }
}