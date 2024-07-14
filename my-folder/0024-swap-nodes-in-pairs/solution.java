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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode temp = dummy;

        while(temp.next!=null && temp.next.next!=null){
            // Identify the node
            ListNode swap1 = temp.next;
            ListNode swap2 = temp.next.next;

            // swap
            swap1.next = swap2.next;
            swap2.next = swap1;

            temp.next = swap2;

            // Move temp to the next pair
            temp = swap1;
            
        }


    return dummy.next;
    }
}
