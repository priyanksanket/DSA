class Solution {
    boolean check(int mid, int n, int sum,int idx){
        long s = (long) mid * (mid+1) / 2;
        int sl = mid-idx-1;
        if(sl<0) sl = 0;
        int el = mid- (n-idx);
        if(el<0) el = 0;
        long rightend =( 1L* el * (el+1))/2;
        long leftend =  (1L * sl * (sl+1))/2;
        long total = s-(rightend + leftend+ mid) +s;
        int a = idx - mid+1;
        if(a> 0) total += a;
        int b = n-idx- mid;
        if(b>0) total += b;
        return total<= sum;



    }
    public int maxValue(int n, int index, int maxSum) {
        int low = 1;
        int high = maxSum;
        int ans = 1;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(check(mid, n, maxSum,index)){
                ans = mid;
                low = mid + 1;
            }else{
                high = mid-1;
            }
        }  
        return ans;      
    }
}