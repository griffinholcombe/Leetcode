# Last updated: 5/26/2026, 11:18:08 AM
class Solution(object):
    def maxProduct(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """

        nums.sort()
        return (nums[-1]-1) * (nums[-2]-1)
        