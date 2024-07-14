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
    public ListNode oddEvenList(ListNode head) {
        ListNode  odd = new ListNode(0);
        ListNode even = new ListNode(-1);

        ListNode o = odd;
        ListNode e = even;
        ListNode temp = head;
        int i=1;
        while(temp!=null){
            
            if(i%2!=0){
                o.next = temp;
                o=o.next;
            }
            else{
                e.next = temp;
                e=e.next;
            }
            i++;
            temp=temp.next;
        }
        e.next = null;
        o.next = even.next;
        return odd.next;
    }
}
