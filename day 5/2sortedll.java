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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
//         if(list1==null)
//         {
//             return list2;
//         }
        
//         else if(list2==null)
//         {
//             return list1;
//         }
//         else{
        
//         ListNode tmp;
//         ListNode tmphead;
        
//         if(list1.val<=list2.val)
//         {
//             tmp=new ListNode(list1.val);
//             list1=list1.next;
            
//         }
//           else{
//               tmp=new ListNode(list2.val);
//               list2=list2.next;
//           }
//          tmphead=tmp;
        
//         while(list1!=null && list2!=null)
//         { ListNode nnode;
//             if(list1.val<= list2.val)
//             {
//                 nnode =new ListNode(list1.val);
//                 list1=list1.next;
//             }
//             else{
//                 nnode=new ListNode(list2.val);
//                 list2=list2.next;
//             }
//        tmp.next=nnode;
//          tmp=nnode;
//         }
        
//             while(list1!=null)
//             {
//                 ListNode nnode= new ListNode(list1.val);
//                 tmp.next=nnode;
//                 tmp=nnode;
//                 list1=list1.next;
//             }
            
//             while(list2!=null)
//             {
//                   ListNode nnode= new ListNode(list2.val);
//                 tmp.next=nnode;
//                 tmp=nnode;
//                 list2=list2.next;
                
//             }
//         return tmphead;
        
        if(list1==null)
        {
            return list2;
        }
        else if(list2==null)
        {
            return list1;
        }
        
        
       ListNode l1;
         ListNode l2; 
        ListNode res;
    
    if(list1.val<= list2.val)
        
    {
        l1=list1;
        l2=list2;
    }
        
        else{
            l1=list2;
            l2=list1;
        }
        
        res=l1;
        
        while(l1!=null && l2!=null)
        { ListNode tmp=null;
            while(l1!=null && l1.val<=l2.val)
            {
                tmp=l1;
                l1=l1.next;
            }
         
         tmp.next=l2;
         tmp=l1;
         l1=l2;
         l2=tmp;
         
        }
    return res;
        
    }
}