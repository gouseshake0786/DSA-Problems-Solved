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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head, prev = null;
        HashSet<Integer> hs = new HashSet<>();
        while(curr !=null){
            if(hs.contains(curr.val)){
                prev.next = curr.next;
                curr = curr.next;
            }else{
                hs.add(curr.val);
                prev = curr;
            }
        }
        return head;
        
    }
}