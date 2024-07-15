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
        private int length(ListNode node) {
        int n = 0;
        while (node != null) {
            node = node.next;
            n++;
        }
        return n;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int n = length(head);
        k=k%n;
        if(k==0 )  return head;

        for(int i=0 ; i<k ; i++){
            ListNode temp = head;
            while(temp.next.next!=null){
                temp = temp.next;
            }
            ListNode last = temp.next;
            temp.next = null;
            last.next = head;
            head = last;
        }
        return head;
    }
}
