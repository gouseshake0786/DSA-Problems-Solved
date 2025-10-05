/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next ==null){
            return null;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast !=null && fast.next !=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                ListNode first = head;
                ListNode second = slow;
                while(first != second){
                    first = first.next;
                    second = second.next;
                }
                return first;
            }
        }
        return null;
    }
}