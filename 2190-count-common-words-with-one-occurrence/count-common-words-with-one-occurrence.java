class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String,Integer> m1= new HashMap<>();
        Map<String,Integer> m2= new HashMap<>();
        for(String s: words1){
            if(m1.containsKey(s)){
                m1.put(s,m1.get(s)+1);

            }else m1.put(s,1);
        }
        for(String s: words2){
            if(m2.containsKey(s)){
                m2.put(s,m2.get(s)+1);

            }else m2.put(s,1);
        }
        int count=0;
        for(String s: words1){
            if(m2.containsKey(s)){
                if(m1.get(s)==1 && m2.get(s)==1){
                    count++;
                }
            }
        }
        return count;
    }
}