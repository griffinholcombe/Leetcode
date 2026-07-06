# Last updated: 7/6/2026, 10:54:45 AM
1class Solution(object):
2    def twoSum(self, nums, target):
3        """
4        :type nums: List[int]
5        :type target: int
6        :rtype: List[int]
7        """
8        seen = {}
9        for i, num in enumerate(nums):
10            compliment = target - num
11
12            if compliment in seen:
13                return [seen[compliment], i]
14
15            seen[num] = i
16
17        return []
18            
19            
20        