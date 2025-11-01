
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode extra= new ListNode(0);
        extra.next= head;
        ListNode temp=extra;

        Set<Integer> st = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        while(temp!=null&& temp.next!=null ){
            ListNode t= temp.next;
            while(st.contains(t.val)){
                t= t.next;
                if(t==null) break;
            }
            temp.next= t;
            temp=t;
        }
        return extra.next;
        
    }
}