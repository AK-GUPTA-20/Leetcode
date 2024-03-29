# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def swapPairs(self, head):
        current = head
        while current!=None and current.next!=None:
            current.val , current.next.val = current.next.val , current.val
            current = current.next.next

        return head
