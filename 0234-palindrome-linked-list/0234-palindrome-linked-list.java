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
    public ListNode reverse(ListNode head){
        if(head == null) return head;

        ListNode prev = null;
        ListNode curr = head;
        ListNode node = curr.next;
        while(curr !=null){
            curr.next = prev;
            prev = curr;
            curr = node;
            if(node !=null){
                node = node.next;
            }
        }
        return prev;
    }

    public boolean isIdentical(ListNode n1, ListNode n2){
        while(n1 !=null && n2 !=null){
            if(n1.val !=n2.val)
                return false;
            n1 = n1.next;
            n2 = n2.next;
        }
        return true;
    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null
               && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = reverse(slow.next);
        slow.next = null;

        return isIdentical(head, head2);
    }
}