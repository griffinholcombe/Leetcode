# Last updated: 7/10/2026, 5:47:02 PM
1# Definition for singly-linked list.
2# class ListNode:
3#     def __init__(self, val=0, next=None):
4#         self.val = val
5#         self.next = next
6class Solution:
7    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
8
9        ans = ListNode(0,head)
10        cur = ans
11
12        while cur:
13            while cur.next and cur.next.val == val:
14                cur.next = cur.next.next
15            cur = cur.next
16
17        return ans.next
18        