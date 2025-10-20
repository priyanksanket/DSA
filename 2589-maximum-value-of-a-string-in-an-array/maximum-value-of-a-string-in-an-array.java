class Solution {
    public int val(String s){
        try{
            return Integer.parseInt(s);
        }catch(NumberFormatException e){
            return s.length();
        }
    }
    public int maximumValue(String[] strs) {
        
        int max=0;
        for(String s: strs){
            max= Math.max(max,val(s));
        }
        return max;

    }
}