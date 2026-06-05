// Last updated: 6/5/2026, 10:37:09 AM
1class Solution {
2    public int climbStairs(int n) {
3        Map<Integer,Integer> map = new HashMap<>();
4        return climbStairs(n, map);
5    }
6
7    private int climbStairs(int n, Map<Integer,Integer> map){
8        if (n == 0 || n == 1){
9            return 1;
10        }
11        if (!map.containsKey(n)){
12            map.put(n, climbStairs(n-1, map) + climbStairs(n-2, map));
13        }
14        return map.get(n);
15    }
16}
17
18    