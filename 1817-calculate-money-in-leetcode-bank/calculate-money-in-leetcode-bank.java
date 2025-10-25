class Solution {
    public int totalMoney(int n) {
        int monday =0;
        
        int current=0;
        int sum=0;
        for(int i=0;i<n;i++){
            if(i%7==0){
                current = ++monday;

                
            }else{
                current++;
                
            }
            sum+= current;
        }
        return sum;
        
    }
}