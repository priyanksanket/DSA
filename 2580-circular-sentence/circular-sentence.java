class Solution {
    public boolean isCircularSentence(String s) {
        String[] arr= s.split(" ");
        for(int i=0;i<arr.length-1;i++){
            String one= arr[i];
            String two = arr[i+1];
            if(one.charAt(one.length()-1)!= two.charAt(0)) return false;
        }
        String last= arr[arr.length-1];
        String first= arr[0];
        if(last.charAt(last.length()-1)!= first.charAt(0))return false;
        return true;
        
    }
}