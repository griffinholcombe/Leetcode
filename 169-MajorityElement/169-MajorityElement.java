// Last updated: 5/26/2026, 11:18:17 AM
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length;i++){
            if (map.get(nums[i]) == null){
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i])+1);
            }
        }
        int n = nums.length / 2;
        for (int i = 0; i < nums.length; i++){
            if (map.get(nums[i]) > n){
                return nums[i];
            }
        }

        return 0;
    }
}