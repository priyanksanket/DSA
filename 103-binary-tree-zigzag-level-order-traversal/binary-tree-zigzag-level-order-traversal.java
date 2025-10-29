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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode>  q= new LinkedList<>();
        List<List<Integer>> l= new ArrayList<List<Integer>>();
        if(root== null) return l;
        q.offer(root);
        boolean leftTright=true;
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> temp= new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode x=q.poll();
                if(x.left!=null) q.offer(x.left);
                if(x.right!=null) q.offer(x.right);
                temp.add(x.val);
            }
            if(leftTright){
                l.add(temp);
            }else{
                Collections.reverse(temp);
                l.add(temp);
            }
            leftTright=!leftTright;
        }
        return l;
        
    }
}