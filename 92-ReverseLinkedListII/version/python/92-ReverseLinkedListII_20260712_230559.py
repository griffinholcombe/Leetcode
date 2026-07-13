# Last updated: 7/12/2026, 11:05:59 PM
1# Definition for singly-linked list.
2# class ListNode:
3#     def __init__(self, val=0, next=None):
4#         self.val = val
5#         self.next = next
6class Solution:
7    def reverseBetween(self, head: Optional[ListNode], left: int, right: int) -> Optional[ListNode]:
8    
9        if head is None or left == right:
10            return head
11
12        
13        dummy = ListNode(0,head)
14        prev = dummy
15
16        for _ in range(left - 1):
17            prev = prev.next
18
19        cur = prev.next
20        for _ in range(right - left):
21            temp = cur.next
22            cur.next = temp.next
23            temp.next = prev.next
24            prev.next = temp
25        
26        return dummy.next
27        
28
29   
30
31
32
33    
34
35        