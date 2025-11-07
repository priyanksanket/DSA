class Solution {
    public void fill(TreeNode root, List<Integer> l){
        if(root==null) return;
        if(root.left==null && root.right==null){
            l.add(root.val);
            return;
        }
        fill(root.left,l);
        fill(root.right,l);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1= new ArrayList<>();
        List<Integer> l2= new ArrayList<>();
        fill(root1,l1);
        fill(root2,l2);
        if(l1.size()!=l2.size()) return false;
        int n= l1.size();
        for(int i=0;i<n;i++){
            if(!l1.get(i).equals(l2.get(i)))return false;
        }
        return true;
        
    }
}