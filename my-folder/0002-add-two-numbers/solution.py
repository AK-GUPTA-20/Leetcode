# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        dummy = ListNode(0)
        current = dummy 
        carr=0
        while (l1!=None or l2!=None or carr):
            sum = 0
            if l1!=None:
                sum = sum+l1.val
                l1 = l1.next
            if l2!=None:
                sum = sum+l2.val
                l2 = l2.next
            sum += carr
            carr = sum//10

            new_node = ListNode(sum % 10)
            current.next = new_node
            current = current.next
        return dummy.next
