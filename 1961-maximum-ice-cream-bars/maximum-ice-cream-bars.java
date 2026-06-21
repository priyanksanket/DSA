class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int sum=0;
        int count =0;
        for(int x : costs){
            sum+= x;
            if(sum>coins){
                return count;
            }
            count++;
        }
        return count;
        
    }
}