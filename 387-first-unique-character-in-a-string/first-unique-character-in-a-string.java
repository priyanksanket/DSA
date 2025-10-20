class Solution {
    public int firstUniqChar(String s) {
        int n=s.length();
        Map<Character,Integer> mp= new HashMap<>();
        for(char x: s.toCharArray()){
            if(mp.containsKey(x)){
                mp.put(x,mp.get(x)+1);

            }else{
                mp.put(x,1);
            }
        }
        for(int i=0;i<n;i++){
            char x= s.charAt(i);
            if(mp.get(x)==1) return i;
        }
        return -1;
        
    }
}