// Last updated: 5/26/2026, 11:18:11 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        if (sLen > tLen) return false;

        int i = 0;
        int j = 0;

        int total = 0;

        while ((i < sLen) && (j < tLen)) {
            if(s.charAt(i) == t.charAt(j)) {
                total++;
                i++;
                j++;
            }
            else j++;
        }

        return total == sLen;
    }
}