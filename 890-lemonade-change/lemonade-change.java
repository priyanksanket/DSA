class Solution {
    public boolean lemonadeChange(int[] nums) {
        int n= nums.length;
        int a = 0;
        int b = 0;
        for(int x: nums){
            if(x == 5){
                a++;
            }else if (x==10){
                b++;
                a--;
            }else{
                if(b>0){
                    b--;
                    a--;
                }else{
                    a-=3;
                }
            }
            if(a<0 || b<0) return false;
        }
        return true;
    }
}