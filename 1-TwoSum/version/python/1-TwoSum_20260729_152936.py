# Last updated: 7/29/2026, 3:29:36 PM
1class Solution(object):
2    def twoSum(self, nums, target):
3        """
4        :type nums: List[int]
5        :type target: int
6        :rtype: List[int]
7        """
8        seen = {}
9        n = len(nums)
10
11        for i in range(n):
12            compliment = target - nums[i]
13            if compliment in seen:
14                return [seen[compliment], i]
15            seen[nums[i]] = i
16        return []
17            
18            
19        