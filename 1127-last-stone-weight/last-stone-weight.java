class Solution {
    public int lastStoneWeight(int[] arr) {
        int n=arr.length;
        if(n<2) return arr[0];
        Arrays.sort(arr);
        int a=n-1;
        int b= n-2;
        while(a>0){
            arr[b]= arr[a]-arr[b];
            a--;
            b--;
            Arrays.sort(arr);
        }
        return arr[a];
        
    }
}