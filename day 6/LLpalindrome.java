
class Solution {
    public boolean isPalindrome(ListNode head) {
        
    


    if(head==null||head.next==null) return true;
        
    ListNode slow = head;
    ListNode fast = head;
        
    while(fast.next!=null&&fast.next.next!=null) {
        slow = slow.next;
        fast = fast.next.next;
    }
        
    slow.next = reverse(slow.next);
    slow = slow.next;
    ListNode dummy = head;
        
    while(slow!=null) {
        if(dummy.val != slow.val) return false;
        dummy = dummy.next;
        slow = slow.next;
    }
    return true;
}
    
    
        static ListNode reverse(ListNode ptr) {
    ListNode pre=null;
   
    while(ptr!=null) {
       ListNode nex = ptr.next;
        ptr.next = pre;
        pre=ptr;
        ptr=nex;
    }
    return pre;
}
    
}