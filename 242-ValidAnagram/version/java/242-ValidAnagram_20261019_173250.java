// Last updated: 10/19/2026, 5:32:50 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3
4        if (s.length() != t.length()) return false;
5        HashMap<Character,Integer> map = new HashMap<>();
6
7        for (int i = 0; i < s.length(); i++){
8            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
9        }
10
11        for (int i = 0; i < t.length(); i++){
12            char ch = t.charAt(i);
13
14            if (!map.containsKey(ch)){
15                return false;
16            }
17
18            map.put(ch, map.get(ch) - 1);
19
20            if (map.get(ch) == 0){
21                map.remove(ch);
22            }
23        }
24        return map.isEmpty();
25    }
26}