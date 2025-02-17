# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        if not list1:
            return list2
        if not list2:
            return list1
        dummy = curr = ListNode(0) # dummy is created just to return as a head, as the head of the main result linkedlist will be stored in the next pointer of the dummy ( |0|dummy.next|->| | | )
        while list1 and list2:
            if list1.val < list2.val:
                curr.next = list1
                list1 = list1.next
            else:
                curr.next = list2
                list2 = list2.next
            curr = curr.next

        if list1 == None:
            curr.next = list2
        if list2 == None:
            curr.next = list1
            
        return dummy.next
            