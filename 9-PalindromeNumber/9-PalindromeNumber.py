# Last updated: 7/6/2026, 11:15:41 AM
class Solution:
   def isPalindrome(self, x: int) -> bool:
       if x < 0:
           return False
       x = str(x)
       return x == x[::-1]

        