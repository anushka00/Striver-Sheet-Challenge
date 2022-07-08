public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        if(head==null || head.next==null)
        {
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
                   if(slow==fast)
                   {
                        fast=head;
        
        while(slow!=fast)
        {
            fast=fast.next;
            slow=slow.next;
        }
        return slow;                       

                   }
        }
        
       return null;
    }
}