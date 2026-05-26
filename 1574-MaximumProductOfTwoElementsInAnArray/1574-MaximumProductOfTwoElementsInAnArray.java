// Last updated: 5/26/2026, 11:18:13 AM
class Solution {
    public int maxProduct(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length-1;

        int result = (nums[n]-1) * (nums[n-1]-1);
        return result;
      
    }
}