/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean check(TreeNode rleft, TreeNode rright){
        if(rleft==null && rright==null)return true;
        if(rleft==null || rright==null) return false;
        if(rleft.val!=rright.val) return false;
        return (check(rleft.left,rright.right) && check(rleft.right,rright.left));
        
    }
    public boolean isSymmetric(TreeNode root) {
        if (root ==null) return true;
        return check(root.left,root.right);
        
    }
}