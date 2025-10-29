class Solution {
    public TreeNode fill(int []nums, int l, int r){
        if(l>r) return null;
        int mid= l+(r-l)/2;
        TreeNode root= new TreeNode(nums[mid]);
        root.left=fill(nums, l,mid-1);
        root.right=fill(nums, mid+1, r);
        return root;
        
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return fill(nums, 0, nums.length-1);
        
        

        
    }
}