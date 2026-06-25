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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null;
        int m=0;
        ListNode temp = head;
        while(temp != null){
            m++;
            temp= temp.next;
        }
        temp = head;
        int x= (m-n);
        if(x==0) return head.next;
        for(int i=1;i<x;i++){
            temp= temp.next;
        }
        temp.next= temp.next.next;
        return head;
        
    }
}