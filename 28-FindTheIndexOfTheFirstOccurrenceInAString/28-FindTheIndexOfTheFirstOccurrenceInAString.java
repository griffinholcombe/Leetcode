// Last updated: 5/26/2026, 11:18:24 AM
class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int k = needle.length();
        int i = 0;
        
        while (i < n && k <= haystack.length()){
            if (haystack.substring(i,k).equals(needle)){
                return i;
            } else {
                i++;
                k++;
            }
        }
        return -1;
    }
}