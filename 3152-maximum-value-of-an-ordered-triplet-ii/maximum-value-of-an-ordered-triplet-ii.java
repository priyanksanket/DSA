class Solution {
    public long maximumTripletValue(int[] nums) {
        int n= nums.length;
        long sahil = 0;
        int []pm = new int[n];
        int []sm = new int[n];
        pm[0]=0;
        sm[n-1]=0;
        int p=nums[0];
        int s =nums[n-1];
        for(int i=1;i<n;i++){
            pm[i]= p= Math.max(p,nums[i-1]);
            
        }
        for(int i= n-2;i>=0;i--){
            sm[i]= s= Math.max(s,nums[i+1]);
        }
        for(int i=1;i<n-1;i++){
            long temp =(long) (pm[i]-nums[i])*sm[i];
            sahil = Math.max(sahil,temp);
        }
        return sahil;
        
        
    }
}