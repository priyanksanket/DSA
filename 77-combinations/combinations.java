class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public void fun(int i, int n, int k, List<Integer> l){
        if(l.size()>k) {
            
            return;
        } 
        if(i>n){
            if(l.size()==k) ans.add(new ArrayList<>(l));
            
            return;
        }

        // include
        l.add(i);
        fun(i+1,n,k,l);
        l.remove(l.size()-1); // backtrack

        // exclude
        fun(i+1,n,k,l);

    }
    public List<List<Integer>> combine(int n, int k) {
        List <Integer> temp = new ArrayList<>();
        fun(1,n,k,temp);
        return ans;

        
    }
}