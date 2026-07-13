# Last updated: 7/13/2026, 1:40:44 PM
1# Definition for singly-linked list.
2# class ListNode:
3#     def __init__(self, val=0, next=None):
4#         self.val = val
5#         self.next = next
6class Solution:
7    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:
8
9        dummy = ListNode(0, head)
10        slow = dummy
11        fast = dummy
12
13        for _ in range(n + 1):
14            fast = fast.next
15        
16        while fast:
17            slow = slow.next
18            fast = fast.next
19        
20        slow.next = slow.next.next
21
22        return dummy.next
23        
24       
25        
26      
27        
28        