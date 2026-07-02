class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int sum=0;
        int high = 0;
        for (int x : piles){
            high = Math.max(high, x);
        }
        int low = 1;

        int ans = high;
        while(low<=high){
            int mid = low + (high-low)/2;
            int count = 0;
            for(int x: piles){
                count += Math.ceil(x/mid);
                if(x% mid != 0) count ++;
            }
            if(count > h){
                low = mid +1;
            }else{
                ans = mid;
                high = mid-1;
            }
        }
        return ans;
        
    }
}