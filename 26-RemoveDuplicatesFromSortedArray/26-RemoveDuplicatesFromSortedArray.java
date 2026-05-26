// Last updated: 5/26/2026, 11:18:27 AM
class Solution {
    public int removeDuplicates(int[] arr) {
       int slow = 0;

       for (int fast = 1; fast < arr.length; fast++){
            if (arr[slow] != arr[fast]){
                slow++;
                arr[slow] = arr[fast];
            }
       }
       return slow+1;
    }
}