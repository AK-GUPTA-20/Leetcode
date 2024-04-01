# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def sortList(self,head):

        if not head or not head.next:
            
            return head

        slow = head
        fast = head.next
        while(fast!=None and fast.next!=None):
            slow = slow.next
            fast = fast.next.next
        mid = slow.next
        slow.next = None

       
        left = self.sortList(head)
        right = self.sortList(mid)

        if left==None:
            return right
        if right == None:
            return left

        dummy = ListNode(0)
        current = dummy

        while left!=None and right !=None:
            if left.val < right.val:
                current.next = left
                
                left = left.next
            else:
                current.next = right
                
                right = right.next
            current = current.next

       
        current.next=left or right
        return dummy.next

        
