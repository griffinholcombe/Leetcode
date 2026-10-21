// Last updated: 10/21/2026, 5:06:10 PM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> list = new HashMap<>();

        for (String s : strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!list.containsKey(key)){
                list.put(key, new ArrayList<>());
            }
            list.get(key).add(s);
        }
        return new ArrayList<>(list.values());
        
    }
}