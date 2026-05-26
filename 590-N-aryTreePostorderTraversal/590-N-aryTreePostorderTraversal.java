// Last updated: 5/26/2026, 12:20:08 PM
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
23
24        dfs(root, result);
25
26        return result;
27    }
28
29    public void dfs(Node root, List<Integer> list){
30        if (root == null) return;
31
32        for (Node n : root.children){
33            dfs(n, list);
34        }
35        list.add(root.val);
36        
37    }
38}