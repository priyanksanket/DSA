class Solution {
    public String reduce(String s){
        int n= s.length();
        while(n>2){
        
            StringBuilder sb= new StringBuilder("");
            for(int i=0;i<n-1;i++){
                int u= ((s.charAt(i)-'0')+(s.charAt(i+1)-'0'))%10;
               

                sb.append(u);
            }
            s= sb.toString();
            n--;
        }
        return s;
    }
    public boolean hasSameDigits(String s) {
        s= reduce(s);
        
        return (s.charAt(0)==s.charAt(1))?true:false;
        
    }
}