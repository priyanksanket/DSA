class Solution {
    public int maxNumberOfBalloons(String text) {
        int a=0;
        int b =0;
        int l=0;
        int o=0;
        int n= 0;
        for(char x: text.toCharArray()){
            if(x=='a')a++;
            else if(x=='b')b++;
            else if(x=='l')l++;
            else if(x=='o')o++;
            else if(x=='n')n++;
        }
        l/=2;
        o/=2;
        return Math.min(Math.min(a,b),Math.min(Math.min(l,o),n));
        
    }
}