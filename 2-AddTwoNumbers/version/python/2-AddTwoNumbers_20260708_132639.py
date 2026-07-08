# Last updated: 7/8/2026, 1:26:39 PM
1# Definition for singly-linked list.
2# class ListNode:
3#     def __init__(self, x):
4#         self.val = x
5#         self.next = None
6
7class Solution:
8    def hasCycle(self, head: Optional[ListNode]) -> bool:
9
10        if head is None:
11            return False
12
13        visited = set()
14        temp = head
15
16        while temp:
17
18            if temp in visited:
19                return True
20
21            visited.add(temp)
22            temp = temp.next
23
24        return False
25
26