// Last updated: 5/26/2026, 12:20:57 PM
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    List<Integer> res = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        getPostOrder(root);
        return res;
    }

    private void getPostOrder(Node n){
        if(n==null) return;

        for(Node child: n.children){
            getPostOrder(child);
        }
        res.add(n.val);
    }
}


