// Last updated: 5/27/2026, 11:24:29 AM
1class Solution {
2    public int[] plusOne(int[] digits) {
3
4
5
6        for (int i = digits.length-1; i >= 0; i--){
7            if (digits[i] + 1 != 10){
8                digits[i]++;
9                return digits;
10            }
11            digits[i] = 0;
12        }
13        
14        int[] temp = new int[digits.length + 1];
15        temp[0] = 1;
16        return temp;
17    }
18}