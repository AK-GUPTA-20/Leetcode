class ListNode:
  def __init__(self, val):
    self.val = val
    self.next = None
    
class MyLinkedList:

  def __init__(self):
    self.size = 0
    self.head = None

  def get(self, index) :
    if index >= self.size:
      return -1
    node = self.head
    for _ in range(index):
      node = node.next
    return node.val

  def addAtHead(self, val) :
    self.addAtIndex(0, val)

  def addAtTail(self, val) :
    self.addAtIndex(self.size, val)

  def addAtIndex(self, index, val):
    if index > self.size:
      return -1
    node = self.head
    new_node = ListNode(val)
    if index == 0:
      new_node.next = node
      self.head = new_node
    else:
      for _ in range(index - 1):
        node = node.next
      new_node.next = node.next
      node.next = new_node
    self.size += 1
    

  def deleteAtIndex(self, index) :
    if index >= self.size:
      return -1
    node = self.head
    if index == 0:
      self.head = node.next
    else:
      for _ in range(index - 1):
        node = node.next
      node.next = node.next.next
    self.size -= 1
