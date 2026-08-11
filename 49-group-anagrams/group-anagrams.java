class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();
        for(String s : strs){
            char [] arr = s.toCharArray();
            Arrays.sort(arr);
            String a = new String(arr);
            mp.computeIfAbsent(a, k-> new ArrayList<>()).add(s);
        }
        List<List<String>> ans = new ArrayList<>();
        for(String key: mp.keySet()){
            ans.add(mp.get(key));
        }
        return ans;
        
    }
}