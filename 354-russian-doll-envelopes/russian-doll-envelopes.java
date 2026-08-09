class Solution {
    public int maxEnvelopes(int[][] nums) {
        Arrays.sort(nums,(a,b)->{
            if(a[0]==b[0]){
               return b[1] - a[1];
            }
            return a[0] - b[0];
        });
        List<Integer> l= new ArrayList<>();

        for(int [] x : nums){
            int a =x[1];
            int i = Collections.binarySearch(l,a);
            if(i<0){
                i= -(i+1);
            }
            if(i == l.size()){
                l.add(a);
            }else{
                l.set(i,a);
            }

        }
        return l.size();

        
    }
}