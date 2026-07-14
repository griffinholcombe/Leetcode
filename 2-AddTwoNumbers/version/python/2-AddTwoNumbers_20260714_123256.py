# Last updated: 7/14/2026, 12:32:56 PM
1class Solution:
2    def lengthOfLongestSubstring(self, s: str) -> int:
3
4        max_length = left = 0
5        count = {}
6
7        for right, c in enumerate(s):
8            count[c] = 1 + count.get(c,0)
9            while count[c] > 1:
10                count[s[left]] -= 1
11                left += 1
12            
13            max_length = max(max_length, right - left + 1)
14        
15        return max_length
16        