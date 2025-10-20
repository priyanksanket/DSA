class Solution {
    public String kthDistinct(String[] arr, int k) {
        int n= arr.length;
        Map<String,Integer> mp= new HashMap<>();
        for(String s: arr){
            if(mp.containsKey(s)){
                mp.put(s,mp.get(s)+1);
            }else{
                mp.put(s,1);
            }
        }
        for(String s: arr){
            if(mp.get(s)==1){
                if(k<2){
                    return s;
                }else{
                    k--;
                }
            }
        }
        return "";
        
    }
}