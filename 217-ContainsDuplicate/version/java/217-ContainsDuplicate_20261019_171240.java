// Last updated: 10/19/2026, 5:12:40 PM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        
4        HashMap<Integer, Integer> map = new HashMap<>();
5
6        int n = nums.length;
7
8        for (int i = 0; i < n; i++){
9            if (map.get(nums[i]) == null){
10                map.put(nums[i], 1);
11            } else { 
12                return true;
13            }
14        }
15        return false;
16
17
18
19    }
20}