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
    public void insert(TreeNode root, List l){
        if(root==null) return;
        if(root.left!= null){
            insert(root.left,l);
        }
        l.add(root.val);
        if(root.right!= null){
            insert(root.right,l);
        }
        

    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> l= new ArrayList<>();
        insert(root, l);
        return l;

        
    }
}