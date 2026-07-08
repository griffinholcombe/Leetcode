# Last updated: 7/8/2026, 1:04:33 PM
1# Definition for singly-linked list.
2# class ListNode:
3#     def __init__(self, val=0, next=None):
4#         self.val = val
5#         self.next = next
6class Solution:
7    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
8        dummy = ListNode()
9        result = dummy
10
11        total = carry = 0
12
13        while l1 or l2 or carry:
14            total = carry
15
16            if l1:
17                total += l1.val
18                l1 = l1.next
19            if l2:
20                total += l2.val
21                l2 = l2.next
22
23            num = total % 10
24            carry = total // 10
25            dummy.next = ListNode(num)
26            dummy = dummy.next
27            
28        return result.next
29
30
31        