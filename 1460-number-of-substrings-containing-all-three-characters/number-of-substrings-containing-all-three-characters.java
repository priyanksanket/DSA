class Solution {
    public int numberOfSubstrings(String s) {
        int n= s.length();
        
        int [] f = new int[3];
        int i=0;
        int j=0;
        int total =0;
        while(j<n){
            int x = s.charAt(j)-'a';
            f[x]++;
            while(f[0]>0 && f[1]>0 && f[2]>0){
                total+= n-j;
                int y = s.charAt(i)-'a';
                f[y]--;
                i++;
            }
            j++;
        }
        return total;
        

        
    }
}