class Solution {
    private int preIdx= 0;
    public int search(int[] preorder,int left,int right, int val){
        for(int i=left;i<=right;i++){
            if(preorder[i]==val){
                return i;
            }
        }
        return -1;

    }
    public TreeNode build(int[] preorder,int[] inorder, int left, int right){
        if(left>right) return null;
        int x= preorder[preIdx++];
        TreeNode root= new TreeNode(x);
        int inIdx= search(inorder,left,right,x);
        root.left= build(preorder,inorder,left,inIdx-1);
        root.right= build(preorder,inorder,inIdx+1,right);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        return build(preorder,inorder,0,inorder.length-1);
    }
}