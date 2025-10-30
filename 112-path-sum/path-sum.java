class Solution {
    public boolean check(TreeNode root, int sum, int target){
        if(root==null) return false;
        
        sum+=root.val;
        if(sum==target && (root.left==null &&  root.right==null)) return true;
        else if(root.left==null &&  root.right==null) return false;
        return (check(root.left,sum,target)|| check(root.right,sum,target));

    }
    public boolean hasPathSum(TreeNode root, int target) {
       int sum=0; 
       return check(root,sum,target);
       
    }
}