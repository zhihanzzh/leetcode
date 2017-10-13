/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null){
         return null;
        }
        
        if(head.next == null){
         return head;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode list2 = sortList(slow.next);
        slow.next = null;
        ListNode list1 = sortList(head);
        
        
        return merge(list1, list2);
                
    }
    
    private ListNode merge(ListNode list1,ListNode list2) {
        ListNode p = new ListNode(0);
        ListNode head = p;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                p.next = list1;
                list1 = list1.next;
            } else {
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }
        
        if(list1 == null){
            p.next = list2;
        } else {
            p.next = list1;
        }
        
        return head.next;
    }
        
}