class Solution {
    

    public int[] solve(TreeNode root){
        if(root == null)  return new int[]{0,0};
        
        int [] l = solve(root.left);
        int [] r = solve (root.right);
        int rob = root.val+ l[1] + r[1];
        int not_rob = Math.max(l[0],l[1])+Math.max(r[0],r[1]);
        return new int[]{rob,not_rob};
     }

    public int rob(TreeNode root) {

        int[] x = solve(root);
        return Math.max(x[0],x[1]);

    }
}