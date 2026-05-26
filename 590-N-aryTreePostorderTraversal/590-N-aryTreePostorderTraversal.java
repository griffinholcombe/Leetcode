// Last updated: 5/26/2026, 12:21:55 PM
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> children;
6
7    public Node() {}
8
9    public Node(int _val) {
10        val = _val;
11    }
12
13    public Node(int _val, List<Node> _children) {
14        val = _val;
15        children = _children;
16    }
17}
18*/
19
20class Solution {
21    public List<Integer> postorder(Node root) {
22        List<Integer> result = new ArrayList<>();
23        dfs(root, result);
24
25        return result;
26    }
27
28    public void dfs(Node root, List<Integer> list){
29        if (root == null) return;
30
31        for (Node n : root.children){
32            dfs(n, list);
33        }
34        list.add(root.val);
35        
36    }
37}