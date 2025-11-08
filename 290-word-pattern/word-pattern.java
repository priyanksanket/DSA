class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> mp= new HashMap<>();
        Set<String>  o= new HashSet<>();
        char[] pat= pattern.toCharArray();
        String [] st= s.split(" ");
        int n= pat.length;
        if(pat.length!=st.length) return false;
        for(int i=0;i<n;i++){
            if(mp.containsKey(pat[i])){
                if(!mp.get(pat[i]).equals(st[i])) return false;
            }else{
                if(o.contains(st[i]))return false;
                mp.put(pat[i],st[i]);
                o.add(st[i]);
            }
        }
        return true;
        
    }
}