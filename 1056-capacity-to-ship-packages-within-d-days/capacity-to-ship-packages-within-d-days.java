class Solution {
    public int shipWithinDays(int[] w, int days) {
        int n = w.length;
        int sum = 0;
        int low =0;
        for(int x: w){
            sum+=x;
            low = Math.max(low, x);
        }
        
        int high = sum;
        int cap = sum;
        while(low<=high){
            int mid = low + (high-low)/2;
            int count = 1;
            int s = 0;
            for(int x: w){
                s+= x;
                if(s> mid){
                    count ++;
                    s= x;
                }
            }
            if(count> days){
                low = mid+1;

            }else{
                cap = mid;
                high = mid-1;
                
            }
        }
        return cap;
    }
}