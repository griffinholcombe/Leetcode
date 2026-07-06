# Last updated: 7/6/2026, 11:14:44 AM
1class Solution:
2    def isPalindrome(self, x: int) -> bool:
3        if x < 0:
4            return False
5        rev = int(str(x)[::-1])
6        if rev == x:
7            return True
8        return False
9        