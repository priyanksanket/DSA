class Solution {
    public int numOfPairs(String[] nums, String t) {
        
        
        int n = nums.length;
        int count = 0;
        for(int i= 0;i<n;i++){
            for(int j = 0;j<n;j++){
                if(i==j ) continue;

                StringBuilder sb= new StringBuilder(nums[i]);
                sb.append(nums[j]);
                String x = sb.toString();

                
                if(x.equals(t)) count ++;


            }
        }
        return count;
        
    }
}