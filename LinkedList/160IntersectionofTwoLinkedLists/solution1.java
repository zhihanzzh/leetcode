/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        
        int aL = 0;
        int bL = 0;
        
        ListNode a = headA;
        ListNode b = headB;
        while (a != null) {
            aL++;
            a = a.next;
        }
        
        while (b != null) {
            bL++;
            b = b.next;
        }
        a = headA;
        b = headB;
        
        while (aL > bL) {
            a = a.next;
            aL--;
        }
        
        while (aL < bL) {
            b = b.next;
            bL--;
        }
        
        while (a != null) {
            if (a.val == b.val) {
                return a;
            } else {
                a = a.next;
                b = b.next;
            }
        }
        
        return null;
    }
}