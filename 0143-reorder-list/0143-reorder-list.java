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
    public ListNode findMid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast !=null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

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


    public void reorderList(ListNode head) {
        if(head == null || head.next == null) return;
        ListNode mid = findMid(head);
        ListNode hs = reverse(mid);
        ListNode hf = head;

        while(hf !=null && hs !=null){
            ListNode temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        if(hf !=null){
            hf.next = null;
        }
    }
}