# Last updated: 7/10/2026, 5:34:18 PM
1# Definition for singly-linked list.
2# class ListNode:
3#     def __init__(self, val=0, next=None):
4#         self.val = val
5#         self.next = next
6class Solution:
7    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
8
9        current = head
10        previous = None
11        temp = ListNode()
12
13        while current is not None:
14            temp = current.next
15            current.next = previous
16            previous = current
17            current = temp
18
19        return previous
20
21
22        