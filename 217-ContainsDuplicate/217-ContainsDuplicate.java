// Last updated: 5/26/2026, 11:18:15 AM


class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> map = new HashSet<>();
        for (int num: nums){
            if (map.contains(num)) return true;
            map.add(num);
        }
        return false;
    }
}