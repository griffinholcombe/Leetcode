// Last updated: 10/19/2026, 5:30:46 PM
class Solution {
    public int maxProduct(int[] nums) {
        
        Arrays.sort(nums);
        int n = nums.length-1;

        int result = (nums[n]-1) * (nums[n-1]-1);
        return result;
      
    }
}