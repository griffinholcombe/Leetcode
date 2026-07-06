# Last updated: 7/6/2026, 11:20:35 AM
1class Solution:
2    def isPalindrome(self, x: int) -> bool:
3        if x < 0 or (x % 10 == 0 and x != 0):
4            return False
5
6        halfRev = 0
7
8        while halfRev < x:
9            halfRev = halfRev * 10 + (x % 10)
10            x //= 10
11
12        return halfRev == x or halfRev // 10 == x
13        