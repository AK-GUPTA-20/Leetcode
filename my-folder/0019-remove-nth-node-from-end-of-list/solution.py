# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeNthFromEnd(self, head, n):
        current = head
        len=0
        while current!=None:
            len=len+1
            current=current.next
        element = len-n
        if len==n :
            return head.next
        current=head
        pos=1
        while current!=None:
            
            if pos == element:
                current.next=current.next.next
            current=current.next
            pos=pos+1
        return head
        
