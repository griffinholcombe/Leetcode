// Last updated: 5/26/2026, 11:18:14 AM
class Solution {
    public int missingNumber(int[] nums) {
        int missing = nums.length;
        for (int i = 0; i < nums.length; i++){
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}