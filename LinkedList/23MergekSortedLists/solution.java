/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        for (int i = 0; i < lists.length; i++) {
            ListNode h = lists[i];
            while (h != null) {
                tmp.add(h.val);
                h = h.next;
            }
        }
        Integer[] arr = new Integer[tmp.size()];
        arr = tmp.toArray(arr);
        
        Arrays.sort(arr);
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (Integer i : arr) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        
        return head.next;
    }
}