// Last updated: 5/26/2026, 11:18:23 AM
class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");
        return arr[arr.length-1].length();
    }
}