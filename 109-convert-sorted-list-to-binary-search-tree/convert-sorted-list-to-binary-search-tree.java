/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode fill(List<Integer> l1,int l,int r){
        if(l>r) return null;
        int mid= l+(r-l)/2;
        TreeNode root= new TreeNode(l1.get(mid));
        root.left=fill(l1,l,mid-1);
        root.right= fill(l1,mid+1,r);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null) return null;
        List<Integer> l1= new ArrayList<>();
        ListNode temp=head;
        while(temp!= null){
            l1.add(temp.val);
            temp= temp.next;

        }
        
        

        return fill(l1,0,l1.size()-1);
    }
}