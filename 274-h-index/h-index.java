class Solution {
    public int hIndex(int[] cit) {
        
        int f[] = new int[1001];
        for(int x: cit){
            for(int i=0;i<=x;i++){
                f[i]++;
            }
        }

        for(int j= 1000;j>=0;j--){
            if(f[j]>=j) return j;
        }
        return 0;
        
    }
}