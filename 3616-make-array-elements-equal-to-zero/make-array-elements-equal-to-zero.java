class Solution {
    public int countValidSelections(int[] nums) {
        int n= nums.length;
        int[] ps= new int[n];
        int[] ss= new int[n];
        int count=0;
        ps[0]=nums[0];
        ss[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            ps[i]=ps[i-1]+nums[i];
        }
        for(int i=n-2;i>=0;i--){
            ss[i]=ss[i+1]+nums[i];
        }
        for(int i=0;i<n;i++){
            if(nums[i]==0){
               if(ps[i]==ss[i]){
                count+=2;
               }else if(Math.abs(ps[i]-ss[i])==1){
                count+=1;
               }
            }
        }
        return count;
    }
}