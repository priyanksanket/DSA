class Solution {
    int isPeak(int n){
        String s = Integer.toString(n);
        int l = s.length();
        int p=0;
        int v=0;
        for(int i=1;i<l-1;i++){
            if((s.charAt(i)>s.charAt(i-1)) && (s.charAt(i)>s.charAt(i+1))) p++;
            else if((s.charAt(i)<s.charAt(i-1)) && (s.charAt(i)<s.charAt(i+1))) v++;
        }
        return p+v;

        
    }
    public int totalWaviness(int num1, int num2) {
        if(num2<100) return 0;

        int ans=0;
        for(int i= num1;i<=num2;i++){
            ans+= isPeak(i);
        }
        return ans;
        
    }
}