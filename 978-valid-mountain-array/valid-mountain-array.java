class Solution {
    public boolean validMountainArray(int[] arr) {
        int n= arr.length;
        if(n<3) return false;
        if(arr[0]>arr[1]) return false;
        int p=0;
        boolean flag=true;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                continue;
            }else if(arr[i]==arr[i-1]){
                return false;
            }else{
                p=i;
                break;
            }
        }
        for(int i=p;i<n-1;i++){
            if(arr[i]<=arr[i+1]){
                return false;
            }
        }
        return true;
        
    }
}