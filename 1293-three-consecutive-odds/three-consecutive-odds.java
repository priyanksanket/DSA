class Solution {
    public boolean check(int n){
        return (n&1)==1?true:false;
    }
    public boolean threeConsecutiveOdds(int[] arr) {
        int n= arr.length;
        for(int i=0;i<n-2;i++){
            if(check(arr[i])){
                if(check(arr[i+1]) && check(arr[i+2])){
                    return true;
                }
            }
        }
        return false;
    }
}