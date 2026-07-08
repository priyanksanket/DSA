class Solution {
    public int removeCoveredIntervals(int[][] nums) {
        int n = nums.length;
        
        int count = n;
        for(int i=0;i<n;i++){
            int [] x = nums[i];
            int a = x[0];
            int b = x[1];
            for(int j = 0;j<n;j++){
                if(i==j) continue;
                int [] y = nums[j];
                int c = y[0];
                int d = y[1];
                if(c<= a && b <= d){
                    
                    count --;
                    break;
                }


            }
        }
        return count ;
        
    }
}