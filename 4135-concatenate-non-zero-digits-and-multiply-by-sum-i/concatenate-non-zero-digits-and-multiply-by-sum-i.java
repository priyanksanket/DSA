class Solution {
    public long sumAndMultiply(int n) {
        int rev = 0;
        long sum = 0;
        while(n>0){
            int d = n%10;
            if(d!=0){
               rev = rev*10 + d; 
            }
            
            n/= 10;
            sum+= d;
        }
        int ans = 0;
        while(rev>0){
            ans = ans*10 + (rev%10);
            rev/= 10;
        }
        return sum *  ans;
        
        
    }
}