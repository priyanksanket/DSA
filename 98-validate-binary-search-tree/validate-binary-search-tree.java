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
    public void check(TreeNode root,List l){
        if(root!=null){
            check(root.left,l);
            l.add(root.val);
            check(root.right,l);
        }
    }
    public boolean isValidBST(TreeNode root) {
        List<Integer> l= new ArrayList<>();
        check(root,l);
        for(int i=1;i<l.size();i++){
            if(l.get(i)<=l.get(i-1)){
                return false;
            }
        }
        return true;

    }
}