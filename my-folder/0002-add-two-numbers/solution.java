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
    public void helper(ListNode l1, ListNode l2 , int carry , ListNode res){
        if(l1==null && l2 ==null && carry == 0) return ;

        int n1 = (l1!=null) ? l1.val : 0;
        int n2 = (l2!=null) ? l2.val : 0;
        int num = n1 + n2 + carry;
        int digit = num%10;
        carry = num/10;

        res.next = new ListNode(digit);

        helper( (l1 != null ? l1.next : null), (l2 != null ? l2.next : null) , carry , res.next);
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        helper(l1 ,l2 , 0 , result);

        return result.next;
    }
}
