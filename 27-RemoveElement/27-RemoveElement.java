// Last updated: 5/26/2026, 11:18:25 AM

class Solution {
    public int removeElement(int[] nums, int val) {
        int n = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == val){
                nums[i] = -1;
                n++;
            }
        }
        Arrays.sort(nums);
        reverse(nums);
        return nums.length - n;
    }


    public void reverse(int[] array){
        int n = array.length;
        for (int i = 0; i < n/2; i++){
            int temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
        }
    }
}