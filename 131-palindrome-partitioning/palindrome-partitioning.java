class Solution {
    boolean check(String s, int i,int j){
        
        while(i<j){
            if(s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;

    }
    void fun(int idx, String s,List<String> path,List<List<String>> ans ){
        if(idx == s.length()){
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=idx;i<s.length();i++){
            if(check(s,idx,i)){
                path.add(s.substring(idx,i+1));
                fun(i+1,s,path,ans);
                path.remove(path.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        List<String> path = new ArrayList<>();
        fun(0,s, path, ans);
        return ans;

        
    }
}