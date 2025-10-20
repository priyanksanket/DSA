class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character,Integer> r= new HashMap<>();
        Map<Character,Integer> m= new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            char x= ransomNote.charAt(i);
            if(r.containsKey(x)){
                r.put(x,r.get(x)+1);
            }else{
                r.put(x,1);
            }
        }
        for(int i=0;i<magazine.length();i++){
            char x= magazine.charAt(i);
            if(m.containsKey(x)){
                m.put(x,m.get(x)+1);
            }else{
                m.put(x,1);
            }
        }
        for(Map.Entry<Character,Integer>entry:r.entrySet()){
            if(!m.containsKey(entry.getKey())) return false;
            if(m.get(entry.getKey())<r.get(entry.getKey())) return false;

        }
        return true;
        
    }
}