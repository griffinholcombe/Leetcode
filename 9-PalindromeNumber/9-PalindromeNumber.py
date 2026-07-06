# Last updated: 7/6/2026, 11:09:21 AM
1class Solution(object):
2    def isPalindrome(self, x):
3        """
4        :type x: int
5        :rtype: bool
6        """
7        if x < 0 or (x % 10 == 0 and x != 0):
8            return False
9        
10        half = 0
11
12        while half < x:
13            half = half * 10 + (x % 10)
14            x //= 10
15
16        return half == x or half // 10 == x
17        
18
19            
20
21            
22        