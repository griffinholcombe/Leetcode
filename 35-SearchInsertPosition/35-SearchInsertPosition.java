// Last updated: 5/26/2026, 11:49:43 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        int high = nums.length;
        int low = 0;
        return binarySearch(nums, low, high - 1, target);
    }


    public int binarySearch(int[] nums, int low, int high, int target){
        int mid = low + (high - low) /2 ;
        if (high >= low){

            if (nums[mid] == target){
            return mid;
            }

            if (nums[mid] > target){
                return binarySearch(nums, low, mid - 1, target);
            }

            return binarySearch(nums, mid + 1, high, target);
        }
        return mid;
    }
}