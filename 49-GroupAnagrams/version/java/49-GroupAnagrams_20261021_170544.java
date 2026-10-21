// Last updated: 10/21/2026, 5:05:44 PM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> list = new HashMap<>();
4
5        for (String s : strs){
6            char[] chars = s.toCharArray();
7            Arrays.sort(chars);
8            String key = new String(chars);
9            if (!list.containsKey(key)){
10                list.put(key, new ArrayList<>());
11            }
12            list.get(key).add(s);
13        }
14        return new ArrayList<>(list.values());
15        
16    }
17}