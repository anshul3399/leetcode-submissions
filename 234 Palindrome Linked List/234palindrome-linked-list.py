# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        ans = False
        ar = []
        s1 = s2 = ''
        curr = head
        while (curr != None): # iterating through the Linked List and adding each element into a list
            ar.append(curr.val)
            curr = curr.next
        # print(ar)
        if(len(ar)%2==0): # if the elements in the array (builded using the elements of Linked List) are even
            for j in range(0, int(len(ar)/2)): s1+=str(ar[j])
                
            for j in range(len(ar)-1, int(len(ar)/2)-1, -1): s2+=str(ar[j])
            # print("S1 = ",s1,"\nS2 = ",s2)
            if(s1==s2): ans=True
        
        else: # if the elements in the array are odd 
            for j in range(0, int(len(ar)/2)): s1+=str(ar[j])
                
            for j in range(len(ar)-1, int(len(ar)/2), -1): s2+=str(ar[j])
            # print("S1 = ",s1,"\nS2 = ",s2)
            if(s1==s2): ans=True
        return ans