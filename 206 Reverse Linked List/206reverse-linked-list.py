# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# head = ListNode{val: 1, next: ListNode{val: 2, next: ListNode{val: 3, next: ListNode{val: 4, next: ListNode{val: 5, next: None}}}}}

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        prev = None
        while head:
            curr = head # store the current head in a variable
            head = head.next # update the head to the next node (head = head.next)
            
            curr.next = prev # in the current node, the *next* pointer should point to the previous node
            prev = curr # update the previous node to current node
        
        return prev # return the *previous*, as at end this node will be having the last node updated as a head