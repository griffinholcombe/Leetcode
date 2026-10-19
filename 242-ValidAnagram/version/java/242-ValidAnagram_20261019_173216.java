// Last updated: 10/19/2026, 5:32:16 PM
1class Solution {
2    public boolean isAnagram(String s, String t) {
3        HashMap<Character,Integer> map = new HashMap<>();
4
5        for (int i = 0; i < s.length(); i++){
6            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
7        }
8
9        for (int i = 0; i < t.length(); i++){
10            char ch = t.charAt(i);
11
12            if (!map.containsKey(ch)){
13                return false;
14            }
15
16            map.put(ch, map.get(ch) - 1);
17
18            if (map.get(ch) == 0){
19                map.remove(ch);
20            }
21        }
22        return map.isEmpty();
23    }
24}