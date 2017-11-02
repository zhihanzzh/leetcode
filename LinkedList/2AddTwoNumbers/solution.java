/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode result = head;
        int temp = 0;
        while(l1 != null && l2 != null){
            if(temp == 0){
                if(l1.val + l2.val < 10){
                    head.next = new ListNode(l1.val + l2.val);
                    l1 = l1.next;
                    l2 = l2.next;
                    head = head.next;
                    
                } else {
                    head.next = new ListNode(l1.val + l2.val - 10);
                    l1 = l1.next;
                    l2 = l2.next;
                    head = head.next;
                    temp = 1;
                }
            }
            else {
                if(l1.val + l2.val + 1 < 10){
                    head.next = new ListNode(l1.val + l2.val + 1);
                    l1 = l1.next;
                    l2 = l2.next;
                    head = head.next;
                    temp = 0;
                } else {
                    head.next = new ListNode(l1.val + l2.val - 9);
                    l1 = l1.next;
                    l2 = l2.next;
                    head = head.next;
                }
            }
        }
        

        while(l1 != null && temp == 1 && l1.val == 9) {
            head.next = new ListNode(0);
            head = head.next;
            l1 = l1.next;
        }
        
        while(l2 != null && temp == 1 && l2.val == 9) {
            head.next = new ListNode(0);
            head = head.next;
            l2 = l2.next;
        }
        
        if(l2 != null){
            if(temp == 1){
            l2.val++;
            head.next = l2;
            } else {
                head.next = l2;
            }
        } else if(l1 != null){
            if(temp == 1){
            l1.val++;
            head.next = l1;
            } else {
                head.next = l1;
            }
        } else {
            if(temp == 1){
                head.next = new ListNode(1);
            }
        }
        
        return result.next;
    }
}