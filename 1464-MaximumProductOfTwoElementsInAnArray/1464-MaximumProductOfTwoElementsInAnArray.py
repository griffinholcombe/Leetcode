# Last updated: 10/19/2026, 5:30:42 PM
class Solution(object):
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        nums.sort()
        return (nums[-1]-1) * (nums[-2]-1)
        