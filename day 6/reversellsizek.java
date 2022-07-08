class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode dummy= new ListNode(-1);
        dummy.next=head;
        
        ListNode prev=dummy;
        ListNode curr;
        ListNode nex;
        
        int length=listlen(head);
        
        
        while(length>=k)
        {
            curr= prev.next;
            nex=curr.next;
            
            
            for(int i=1;i<k;i++)
            {
                curr.next=nex.next;
                nex.next=prev.next;
                prev.next=nex;
                nex=curr.next;
                
            }
            
            prev=curr;
            length-=k;
        }
        
        return dummy.next;
    }
    
    static int listlen(ListNode tmp)
    {
        
        int c=0;
        
        while(tmp!=null)
        {
            c++;
            tmp=tmp.next;
        }
        return c;
    }
}